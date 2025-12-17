package com.mycompany.proyectoestructuradedatos;

/**
 *
 * @author 4ar0n
 */
class NodoRutina {
    String descripcion;
    String deporte;
    int duracion; 
    boolean estado;

    NodoRutina sig, ant;

    public NodoRutina(String descripcion, String deporte, int duracion) {
        this.descripcion = descripcion;
        this.deporte = deporte;
        this.duracion = duracion;
        this.estado = true;
        this.sig = this.ant = null;
    }
}

