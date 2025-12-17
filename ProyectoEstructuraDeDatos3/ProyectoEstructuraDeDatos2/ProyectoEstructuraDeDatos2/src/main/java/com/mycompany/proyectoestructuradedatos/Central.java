/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

public class Central {
    public static ListaCircularUsuarios usuarios = new ListaCircularUsuarios();
    public static ListaDeportistas deportistas = new ListaDeportistas();
    public static ListaAsignacionesRutinas asignaciones = new ListaAsignacionesRutinas(100);
    public static Facturacion facturacion = new Facturacion(100);
    public static CatalogoDeportes deportes = new CatalogoDeportes();
    public static CatalogoRutinas rutinas = new CatalogoRutinas();
   
}
