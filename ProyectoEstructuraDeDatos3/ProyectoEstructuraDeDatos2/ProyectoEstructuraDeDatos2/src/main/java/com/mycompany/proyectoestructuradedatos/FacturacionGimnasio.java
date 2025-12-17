/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoestructuradedatos;

import java.time.LocalDate;
import java.time.LocalTime;

public class FacturacionGimnasio {

    public static String obtenerNombreDeportista(String id) {
        Deportista deportista = Central.deportistas.buscarDeportistaPorID(id);
        if (deportista != null) {
            return deportista.getNombre() + " " + (deportista.getApellidos() == null ? "" : deportista.getApellidos());
        }
        return "Deportista no encontrado";
    }

    public static String obtenerRutinaDelMes(String idDeportista, String mes) {
        String descripcion = Central.asignaciones.obtenerDescripcion(idDeportista, mes);
        if (descripcion != null) return descripcion;
        return null;
    }

    


    
    public static Factura crearFactura(String idDeportista, String mes) {
        if (Central.facturacion.existeFacturaPara(idDeportista, mes)) {
            return null;
        }

        String nombre = obtenerNombreDeportista(idDeportista);
        if (nombre.equals("Deportista no encontrado")) {
            return null;
        }

        String rutina = obtenerRutinaDelMes(idDeportista, mes);
        if (rutina == null) {
            return null;
        }

        String fecha = LocalDate.now().toString();
        String hora = LocalTime.now().toString();
        String descripcion = rutina; 

        Factura f = new Factura(fecha, hora, descripcion, nombre, idDeportista, mes);
        if (Central.facturacion.agregarFactura(f)) {
            return f;
        } else {
            return null;
        }
    }

    public static boolean facturarMensual(String idDeportista, String mes, double monto) {
        if (Central.facturacion.existeFacturaPara(idDeportista, mes)) {
            System.out.println("Ya existe factura para el deportista " + idDeportista + " y mes " + mes);
            return false;
        }

        String nombre = obtenerNombreDeportista(idDeportista);
        String rutina = obtenerRutinaDelMes(idDeportista, mes);
        String fecha = LocalDate.now().toString();
        String hora = LocalTime.now().toString();

        String descripcion = rutina + " (Monto: " + monto + ")";

        Factura f = new Factura(fecha, hora, descripcion, nombre, idDeportista, mes);
        if (Central.facturacion.agregarFactura(f)) {
            System.out.println("Factura registrada...");
            return true;
        } else {
            System.out.println("No se pudo registrar...");
            return false;
        }
    }


    public static boolean anularFactura(String idDeportista, String mes) {
        if (Central.facturacion.anularFacturaPorIdYMes(idDeportista, mes) == false) {
            System.out.println("Factura no encontrada.");
            return false;
        }
        System.out.println("Factura anulada.");
        return true;
    }
}