package com.mycompany.proyectoestructuradedatos;

public class CatalogoRutinas {
    
    private NodoRutina cabeza;  

    public CatalogoRutinas() {
        cabeza = null;
        
    }
    

   
    public boolean agregarRutina(String descripcion, String deporte, int duracion, 
                                 CatalogoDeportes catalogoAarón) {
        
    
        if (!catalogoAarón.existeDeporte(deporte)) {
            System.out.println("Error: El deporte '" + deporte + "' no existe en el catálogo.");
            return false;
        }

      
        if (buscarPorDescripcion(descripcion) != null) {
            System.out.println("Advertencia: Ya existe una rutina con la descripción: " + descripcion);
            return false;
        }

        
        NodoRutina nuevo = new NodoRutina(descripcion, deporte, duracion);

        
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.sig = cabeza;
            cabeza.ant = cabeza;
        } else {
        
            NodoRutina ultimo = cabeza.ant;
            ultimo.sig = nuevo;
            nuevo.ant = ultimo;
            nuevo.sig = cabeza;
            cabeza.ant = nuevo;
        }
        System.out.println("Rutina agregada exitosamente.");
        return true;
    }

    public boolean editarRutina(String descripcionVieja, String nuevaDescripcion, 
                                String nuevoDeporte, int nuevaDuracion, 
                                CatalogoDeportes catalogoAarón) {
        
        NodoRutina actual = buscarPorDescripcion(descripcionVieja);
        if (actual == null || !actual.estado) {
            System.out.println("Error: La rutina no existe o está inactiva.");
            return false;
        }
        
        if (!nuevoDeporte.equals(actual.deporte)) {
            if (!catalogoAarón.existeDeporte(nuevoDeporte)) {
                System.out.println("Error: El nuevo deporte no existe.");
                return false;
            }
        }
        
        if (!nuevaDescripcion.equals(descripcionVieja)) {
            if (buscarPorDescripcion(nuevaDescripcion) != null) {
                System.out.println("Advertencia: Ya existe otra rutina con esa descripción.");
                return false;
            }
        }

        actual.descripcion = nuevaDescripcion;
        actual.deporte = nuevoDeporte;
        actual.duracion = nuevaDuracion;
        System.out.println("Rutina editada correctamente.");
        return true;
    }
    public boolean inactivarRutina(String descripcion) {
        NodoRutina rutina = buscarPorDescripcion(descripcion);
        if (rutina == null) {
            System.out.println("Error: Rutina no encontrada.");
            return false;
        }
        if (!rutina.estado) {
            System.out.println("La rutina ya está inactiva.");
            return false;
        }
        rutina.estado = false;
        System.out.println("Rutina inactivada correctamente.");
        return true;
    }

    private NodoRutina buscarPorDescripcion(String desc) {
        if (cabeza == null) return null;

        NodoRutina actual = cabeza;
        do {
            if (actual.descripcion.equalsIgnoreCase(desc)) {
                return actual;
            }
            actual = actual.sig;
        } while (actual != cabeza);
        return null;
    }

    public void mostrarRutinas() {
        if (cabeza == null) {
            System.out.println("No hay rutinas registradas.");
            return;
        }

        System.out.println("\n Catálogo de rutinas");
        NodoRutina actual = cabeza;
        int cont = 1;
        do {
            String status = actual.estado ? "Activa" : "Inactiva";
            System.out.printf("%d. %s | Deporte: %s | Duración: %d min | %s%n",
                    cont++, actual.descripcion, actual.deporte, actual.duracion, status);
            actual = actual.sig;
        } while (actual != cabeza);
        System.out.println();
        
    }
    public boolean existeRutinaConDeporte(String nombreDeporte) {
    if (cabeza == null) return false;
    NodoRutina actual = cabeza;
    do {
        if (actual.deporte.equalsIgnoreCase(nombreDeporte) && actual.estado) {
            return true;
        }
        actual = actual.sig;
    } while (actual != cabeza);
        return false;
    }
}