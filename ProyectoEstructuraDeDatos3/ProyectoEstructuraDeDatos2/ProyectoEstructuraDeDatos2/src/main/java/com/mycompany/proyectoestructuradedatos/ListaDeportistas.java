/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

public class ListaDeportistas {

    private NodoDeportista cabeza;
    private int tam;

    public ListaDeportistas() {
        this.cabeza = null;
        this.tam = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int tamaño() {
        return tam;
    }


    private NodoDeportista buscarNodoPorID(String idBuscada) {
        if (idBuscada == null) return null;
        if (estaVacia()) return null;

        NodoDeportista nodoActual = cabeza;
        do {
            if (nodoActual.dato.getIdentificacion().equals(idBuscada)) {
                return nodoActual;
            }
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != cabeza);

        return null;
    }


    
    public boolean existeDeportista(String idBuscada) {
        return buscarNodoPorID(idBuscada) != null;
    }




    public boolean agregarDeportista(Deportista nuevoDeportista) {
        if (nuevoDeportista == null) return false;
        if (nuevoDeportista.getIdentificacion() == null) return false;

    
        if (existeDeportista(nuevoDeportista.getIdentificacion())) {
            return false;
        }

        NodoDeportista nuevoNodo = new NodoDeportista();
        nuevoNodo.dato = nuevoDeportista;

        if (estaVacia()) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        } else {
            NodoDeportista cola = cabeza.anterior;
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
        }

        tam = tam + 1;
        return true;
    }


    public Deportista buscarDeportistaPorID(String idBuscada) {
        NodoDeportista nodoEncontrado = buscarNodoPorID(idBuscada);
        if (nodoEncontrado != null) {
            return nodoEncontrado.dato;
        }
        return null;
    }


    public boolean editarDeportista(String idBuscada,
                                    String nuevoNombre,
                                    String nuevosApellidos,
                                    String nuevaCiudad,
                                    String nuevaDireccion,
                                    String nuevoTelefono,
                                    String nuevoCorreo,
                                    boolean nuevoEstado) {

        NodoDeportista nodoEncontrado = buscarNodoPorID(idBuscada);

        if (nodoEncontrado == null) {
            
            return false;
        }

        Deportista deportistaEditar = nodoEncontrado.dato;
        deportistaEditar.setNombre(nuevoNombre);
        deportistaEditar.setApellidos(nuevosApellidos);
        deportistaEditar.setCiudad(nuevaCiudad);
        deportistaEditar.setDireccion(nuevaDireccion);
        deportistaEditar.setTelefono(nuevoTelefono);
        deportistaEditar.setCorreo(nuevoCorreo);
        deportistaEditar.setEstado(nuevoEstado);

        return true;
    }

   
    public boolean inactivarDeportista(String idBuscada) {
        NodoDeportista nodoEncontrado = buscarNodoPorID(idBuscada);

        if (nodoEncontrado == null) {
            
            return false;
        }

        nodoEncontrado.dato.setEstado(false);
        return true;
    }

 
    public void listarComoTexto() {
        if (estaVacia()) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Lista de deportistas vacía");
            return;
        }

        String texto = "";
        NodoDeportista nodoActual = cabeza;

        do {
            Deportista d = nodoActual.dato;

            texto += d.getIdentificacion() + " - "
                    + d.getNombre() + " "
                    + d.getApellidos() + " - "
                    + (d.isEstado() ? "Activo" : "Inactivo")
                    + "\n";

            nodoActual = nodoActual.siguiente;

        } while (nodoActual != cabeza);

        javax.swing.JOptionPane.showMessageDialog(null, texto);
    }
}