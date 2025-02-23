package com.registrocamiones.dominio.repuestos;

import com.registrocamiones.dominio.vehiculos.Camion;

public class Motor {
    /* Atributos */
    public Integer numero;
    public Camion esDe;

    /* Constructor */
    public Motor (Integer n, Camion c) {
        this.numero = n;
        this.esDe = c;
    }

    /* Método para indicar que este motor pertenece a un determinado Camión */
    public void setCamion (Camion c) {
        this.esDe = c;
    }
}
