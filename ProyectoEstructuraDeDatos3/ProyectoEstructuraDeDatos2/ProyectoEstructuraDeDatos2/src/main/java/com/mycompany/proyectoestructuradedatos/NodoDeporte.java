/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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