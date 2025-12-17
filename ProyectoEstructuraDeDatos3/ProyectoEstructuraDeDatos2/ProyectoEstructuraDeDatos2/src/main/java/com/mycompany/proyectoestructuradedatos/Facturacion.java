/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

public class Facturacion {

    private Factura[] facturas;
    private int cantidad;
  
    public Facturacion(int tamaño) {
        facturas = new Factura[tamaño];
        cantidad = 0;
    }

    public boolean agregarFactura(Factura f) {
        if (cantidad < facturas.length) {
            facturas[cantidad] = f;
            cantidad = cantidad + 1;
            return true;
        }
        return false;
    }

    public boolean eliminarFactura(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            return false;
        }

        for (int i = posicion; i < cantidad - 1; i++) {
            facturas[i] = facturas[i + 1];
        }

        facturas[cantidad - 1] = null;
        cantidad = cantidad - 1;
        return true;
    }


    public boolean existeFacturaPara(String idDeportista, String mes) {
        for (int i = 0; i < cantidad; i++) {
            Factura f = facturas[i];
            if (f != null && !f.isAnulada()
                && f.getIdDeportista() != null
                && f.getIdDeportista().equalsIgnoreCase(idDeportista)
                && f.getMes().equalsIgnoreCase(mes)) {
                return true;
            }
        }
        return false;
    }


    public int buscarPosicionPorIdYMes(String idDeportista, String mes) {
        for (int i = 0; i < cantidad; i++) {
            Factura f = facturas[i];
            if (f != null
                && f.getIdDeportista() != null
                && f.getIdDeportista().equalsIgnoreCase(idDeportista)
                && f.getMes().equalsIgnoreCase(mes)) {
                return i;
            }
        }
        return -1;
    }


    public boolean anularFacturaPorIdYMes(String idDeportista, String mes) {
        int pos = buscarPosicionPorIdYMes(idDeportista, mes);
        if (pos == -1) return false;
        facturas[pos].anular();
        return true;
    }

    public String mostrarFacturas() {
        String textoFactura = "";
        for (int i = 0; i < cantidad; i++) {
            Factura f = facturas[i];
            if (f != null) {
                textoFactura += "Factura " + i + ":\n";
                textoFactura += "Fecha: " + f.getFecha() + "\n";
                textoFactura += "Hora: " + f.getHora() + "\n";
                textoFactura += "ID Deportista: " + f.getIdDeportista() + "\n";
                textoFactura += "Cliente: " + f.getNombreCliente() + "\n";
                textoFactura += "Mes: " + f.getMes() + "\n";
                textoFactura += "Rutinas: " + f.getDescripcionRutinas() + "\n";
                if (f.isAnulada()) textoFactura += "[ANULADA]\n";
                textoFactura += "\n";
            }
        }

        return textoFactura;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}