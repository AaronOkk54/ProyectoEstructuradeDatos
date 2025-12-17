package com.mycompany.proyectoestructuradedatos;

import javax.swing.JOptionPane;


public class PadreFamilia extends Persona {  

    private Deportista nombreDeportista;

    public PadreFamilia(Deportista nombreDeportista) {
        this.nombreDeportista = nombreDeportista;
    }

    public void agregarPadre(Deportista NombreNino){
        this.nombreDeportista = NombreNino;
        setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del padre: "));
        setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad de residencia del Padre: "));
        setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico del padre: "));
        setDireccion(JOptionPane.showInputDialog("Ingrese la direccion de residencia del padre: "));
        setEstado(true);
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre del padre: "));
        setTelefono(JOptionPane.showInputDialog("Ingrese el numero de telefono del padre del padre: "));
    }
    
    public void editarPadre(String nombreNino){

    }
    public void inactivarPadre(String nombreNino){
        
    }
    public PadreFamilia consultarPadre(String nombreNino){
        
        return null;
    }

    public Deportista getNombreDeportista() {
        return nombreDeportista;
    }

    public void setNombreDeportista(Deportista nombreDeportista) {
        this.nombreDeportista = nombreDeportista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
