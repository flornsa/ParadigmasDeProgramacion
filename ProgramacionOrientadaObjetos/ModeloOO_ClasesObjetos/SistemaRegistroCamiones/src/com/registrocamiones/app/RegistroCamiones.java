package com.registrocamiones.app;

import com.registrocamiones.dominio.legal.*;
import com.registrocamiones.dominio.vehiculos.*;
import com.registrocamiones.dominio.repuestos.*;

public class RegistroCamiones {
    public static void main(String[] args) {
        // Crear una oficina de Registro del Automotor
        RNA registroMendoza = new RNA();

        // Crear algunos choferes
        Chofer chofer1 = new Chofer("Juan Pérez", "ABC123", 10);
        Chofer chofer2 = new Chofer("María Gómez", "XYZ789", 5);

        // Crear una fábrica de camiones
        Fabrica fabrica = new Fabrica("Fábrica de Camiones Mendoza");

        // Crear motores
        Motor motor1 = new Motor(1001, null);
        Motor motor2 = new Motor(1002, null);

        // Construir camiones usando la fábrica
        Camion camion1 = fabrica.construye("Carlos López", "Volvo", 5001, chofer1, motor1);
        Camion camion2 = fabrica.construye("Ana Ramírez", "Mercedes", 5002, chofer2, motor2);

        // Registrar los camiones en el RNA
        camion1.setInscripto(registroMendoza);
        camion2.setInscripto(registroMendoza);

        camion1.registrar();
        camion2.registrar();

        // Mostrar los registros de títulos en el RNA
        System.out.println("Registro de Títulos en " + registroMendoza.id + ":");
        registroMendoza.mostrar();
    }
}