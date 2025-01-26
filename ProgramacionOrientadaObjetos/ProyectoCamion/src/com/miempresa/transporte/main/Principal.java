package com.miempresa.transporte.main;
import com.miempresa.transporte.model.Camion;

public class Principal {

    public static void main (String[] args) {
        Camion camionDeCocaCola = new Camion ("Scania", 1.5f , "Juan Perez");
        Camion otroCamion = new Camion ("Ford", 1.3f, "Maria Gomez");
        Camion tercerCamion  = new Camion (otroCamion);     //Objeto del constructor de copia
        Camion cuartoCamion = camionDeCocaCola;             //Objeto del constructor sobrecargado

        /* Imprimir los objetos */

        System.out.println("Camión de Coca Cola");
        System.out.println(camionDeCocaCola);

        System.out.println("Otro camión:");
        System.out.println(otroCamion);

        System.out.println("Tercer camión:");
        System.out.println(tercerCamion);
    }
}
