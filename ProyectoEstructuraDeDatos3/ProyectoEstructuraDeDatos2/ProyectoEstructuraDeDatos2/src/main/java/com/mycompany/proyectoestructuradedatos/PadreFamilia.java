/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;



public class PadreFamilia extends Persona {  

    private Deportista hijo;

    public PadreFamilia(Deportista hijo) {
        this.hijo = hijo;
    }

    public void agregarPadre(String nombre, String apellidos, String ciudad, String direccion, String telefono, String correo, Deportista hijo) {
        setNombre(nombre);
        setApellidos(apellidos);
        setCiudad(ciudad);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreo(correo);
        setEstado(true);
        this.hijo = hijo;
    }
    
    public void editarPadre(String nombreNino){

    }
    public void inactivarPadre(String nombreNino){
        
    }
    public PadreFamilia consultarPadre(String nombreNino){
        
        return null;
    }

    public Deportista getHijo() {
        return hijo;
    }

    public void setHijo(Deportista hijo) {
        this.hijo = hijo;
    }
    
    
}
