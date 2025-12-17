package com.mycompany.proyectoestructuradedatos;

public class ListaAsignacionesRutinas {
    private AsignacionRutina[] asignaciones;
    private int cantidad;

    public ListaAsignacionesRutinas(int tamaño) {
        asignaciones = new AsignacionRutina[tamaño];
        cantidad = 0;
    }

    public boolean agregarAsignacion(AsignacionRutina a) {
        if (a == null) return false;
        if (cantidad < asignaciones.length) {
            asignaciones[cantidad++] = a;
            return true;
        }
        return false;
    }

    public String obtenerDescripcion(String idDeportista, String mes) {
        if (idDeportista == null || mes == null) return null;
        for (int i = 0; i < cantidad; i++) {
            AsignacionRutina a = asignaciones[i];
            if (a != null && a.getIdDeportista().equalsIgnoreCase(idDeportista)
                    && a.getMes().equalsIgnoreCase(mes)) {
                return a.getDescripcion();
            }
        }
        return null;
    }

    public boolean existeAsignacion(String idDeportista, String mes) {
        return obtenerDescripcion(idDeportista, mes) != null;
    }
}
