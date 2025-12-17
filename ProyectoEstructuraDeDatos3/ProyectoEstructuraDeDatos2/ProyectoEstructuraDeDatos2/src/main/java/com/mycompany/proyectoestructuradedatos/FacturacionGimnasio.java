package com.mycompany.proyectoestructuradedatos;

import java.time.LocalDate;
import java.time.LocalTime;

public class FacturacionGimnasio {

    private static ListaDeportistas listaDeportistas = new ListaDeportistas();
    private static ListaAsignacionesRutinas asignaciones = new ListaAsignacionesRutinas(100);






    private static Facturacion facturacion = new Facturacion(100);






    public static String obtenerNombreDeportista(String id) {
        Deportista deportista = listaDeportistas.buscarDeportistaPorID(id);
        if (deportista != null) {
            return deportista.getNombre() + " " + (deportista.getApellidos() == null ? "" : deportista.getApellidos());
        }
        return "Deportista no encontrado";
    }

    public static String obtenerRutinaDelMes(String idDeportista, String mes) {
        String descripcion = asignaciones.obtenerDescripcion(idDeportista, mes);
        if (descripcion != null) return descripcion;
        return "No tiene rutina asignada para este mes";
    }

    public static void generarFactura(String idDeportista, String mes, double monto) {
        String nombre = obtenerNombreDeportista(idDeportista);
        String rutina = obtenerRutinaDelMes(idDeportista, mes);

        System.out.println("===== FACTURA =====");
        System.out.println("Cliente: " + nombre);
        System.out.println("Mes: " + mes);
        System.out.println("Rutina asignada: " + rutina);
        System.out.println("Monto a pagar: ₡" + monto);
        System.out.println("===================");
    }





    public static boolean facturarMensual(String idDeportista, String mes, double monto) {
        if (facturacion.existeFacturaPara(idDeportista, mes)) {
            System.out.println("Ya existe factura para el deportista " + idDeportista + " y mes " + mes);
            return false;
        }

        String nombre = obtenerNombreDeportista(idDeportista);
        String rutina = obtenerRutinaDelMes(idDeportista, mes);
        String fecha = LocalDate.now().toString();
        String hora = LocalTime.now().toString();

        String descripcion = rutina + " (Monto: " + monto + ")";

        Factura f = new Factura(fecha, hora, descripcion, nombre, idDeportista, mes);
        if (facturacion.agregarFactura(f)) {
            System.out.println("Factura registrada...");
            return true;
        } else {
            System.out.println("No se pudo registrar...");
            return false;
        }
    }


    public static boolean anularFactura(String idDeportista, String mes) {
        if (facturacion.anularFacturaPorIdYMes(idDeportista, mes) == false) {
            System.out.println("Factura no encontrada.");
            return false;
        }
        System.out.println("Factura anulada.");
        return true;
    }
}