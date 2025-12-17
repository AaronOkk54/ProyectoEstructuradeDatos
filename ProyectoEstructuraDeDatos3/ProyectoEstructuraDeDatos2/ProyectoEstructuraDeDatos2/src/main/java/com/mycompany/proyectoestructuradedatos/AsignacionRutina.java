package com.mycompany.proyectoestructuradedatos;

public class AsignacionRutina {
    private String idDeportista;
    private String mes;
    private String descripcion;

    public AsignacionRutina(String idDeportista, String mes, String descripcion) {
        this.idDeportista = idDeportista;
        this.mes = mes;
        this.descripcion = descripcion;
    }

    public String getIdDeportista() {
        return idDeportista;
    }

    public String getMes() {
        return mes;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
