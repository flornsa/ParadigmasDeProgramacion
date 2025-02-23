package com.registrocamiones.dominio.vehiculos;

import com.registrocamiones.dominio.legal.Chofer;
import com.registrocamiones.dominio.repuestos.Motor;

// Representa la fábrica encargada e producir Camiones
public class Fabrica {
    /* Atributos */
    public String nombre;

    /* Constructor */
    public Fabrica (String nombre) {
        this.nombre = nombre;
    }

    /* Método para crear un Camión y retornarlo */
    public Camion construye (String prop, String marca, Integer chasis, Chofer chofer, Motor motor) {
        Camion c = new Camion(prop, marca, chasis, chofer, motor);
        motor.esDe = c;     // Indica que el motor es de este camión

        return c;
    }
}
