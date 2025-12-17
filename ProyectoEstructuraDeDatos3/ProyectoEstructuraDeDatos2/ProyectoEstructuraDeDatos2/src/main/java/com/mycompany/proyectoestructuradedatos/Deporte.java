/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;
//
///**
// *
// * @author 4ar0n
// */
public class Deporte {
    private String nombre;
    private String caracteristicas;
    private boolean activo;

    public Deporte(String nombre, String caracteristicas, boolean activo) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.activo = activo;
    }

    public String getNombre() { return nombre; }
    public String getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}