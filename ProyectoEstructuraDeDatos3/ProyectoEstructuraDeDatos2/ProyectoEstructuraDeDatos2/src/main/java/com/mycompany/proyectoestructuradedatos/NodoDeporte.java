package com.mycompany.proyectoestructuradedatos;

public class NodoDeporte {
    Deporte dato;
    NodoDeporte siguiente;
    NodoDeporte anterior;

    public NodoDeporte(Deporte d) {
        this.dato = d;
        this.siguiente = null;
        this.anterior = null;
    }
}