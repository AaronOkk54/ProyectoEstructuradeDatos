/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

/**
 *
 * @author 4ar0n
 */

public class CatalogoDeportes {

    private NodoDeporte cabeza;
    private int cantidad;

    public CatalogoDeportes() {
        this.cabeza = null;
        this.cantidad = 0;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    public boolean agregarDeporte(String nombre, String caracteristicas) {
        if (nombre == null || caracteristicas == null) return false;
        if (buscarNodoPorNombre(nombre) != null) return false;

        Deporte nuevoDeporte = new Deporte(nombre, caracteristicas, true);
        NodoDeporte nuevoNodo = new NodoDeporte(nuevoDeporte);

        if (isEmpty()) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoDeporte cola = cabeza.anterior;
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
        }
        cantidad++;
        return true;
    }

    public boolean editarDeporte(String nombre, String nuevasCaracteristicas) {
        NodoDeporte nodo = buscarNodoPorNombre(nombre);
        if (nodo == null) return false;
        nodo.dato.setCaracteristicas(nuevasCaracteristicas);
        return true;
    }

    public boolean inactivarDeporte(String nombre, CatalogoRutinas catalogoRutinas) {
        NodoDeporte nodo = buscarNodoPorNombre(nombre);
        if (nodo == null) return false;
        if (!nodo.dato.isActivo()) return false;
        if (catalogoRutinas != null && catalogoRutinas.existeRutinaConDeporte(nombre)) return false;
        nodo.dato.setActivo(false);
        return true;
    }
    private NodoDeporte buscarNodoPorNombre(String nombre) {
        if (nombre == null || isEmpty()) return null;
        NodoDeporte actual = cabeza;
        do {
            if (actual.dato.getNombre().equalsIgnoreCase(nombre)) return actual;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return null;
    }

    public void listarDeportes() {
        if (isEmpty()) {
            System.out.println("No hay deportes registrados.");
            return;
        }
        NodoDeporte actual = cabeza;
        int i = 1;
        do {
            String estado = actual.dato.isActivo() ? "Activo" : "Inactivo";
            System.out.printf("%d. %s | %s | %s%n", i++, actual.dato.getNombre(), actual.dato.getCaracteristicas(), estado);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public boolean existeDeporte(String nombre) {
        return buscarNodoPorNombre(nombre) != null;
    }
}