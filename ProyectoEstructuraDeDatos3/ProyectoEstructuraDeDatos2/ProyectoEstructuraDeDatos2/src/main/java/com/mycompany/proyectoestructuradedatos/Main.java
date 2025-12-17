package com.mycompany.proyectoestructuradedatos;

/**
 *
 * @author XPC
 */
public class Main {

    public static void main(String[] args) {
        // Ejemplo 
        CatalogoDeportes catalogoDeportes = new CatalogoDeportes();
        CatalogoRutinas catalogoRutinas = new CatalogoRutinas();
        catalogoDeportes.agregarDeporte("Fitness", "Entrenamiento general");
        catalogoRutinas.agregarRutina("Rutina de ejemplo: Full body", "Fitness", 45, catalogoDeportes);
        catalogoRutinas.mostrarRutinas();
    }
    
}
