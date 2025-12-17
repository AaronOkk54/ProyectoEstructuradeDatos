package com.mycompany.proyectoestructuradedatos;

public class Factura {

    private String fecha;
    private String hora;
    private String descripcionRutinas;
    private String nombreCliente;
    private String idDeportista;
    private String mes;
    private boolean anulada;

    public Factura(String fecha, String hora, String descripcionRutinas, String nombreCliente) {
        this(fecha, hora, descripcionRutinas, nombreCliente, "", "");
    }

    public Factura(String fecha, String hora, String descripcionRutinas, String nombreCliente, String idDeportista, String mes) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcionRutinas = descripcionRutinas;
        this.nombreCliente = nombreCliente;
        this.idDeportista = idDeportista;
        this.mes = mes;
        this.anulada = false;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDescripcionRutinas() {
        return descripcionRutinas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getIdDeportista() {
        return idDeportista;
    }

    public String getMes() {
        return mes;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void anular() {
        this.anulada = true;
    }
}