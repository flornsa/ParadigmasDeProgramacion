package com.registrocamiones.dominio.vehiculos;

/* Esta clase representa el chasis del camón. El camión es
 * el encargado de instancia.
 * */
public class Chasis {
    /* Atributos */
    public Integer numero;      // El número de chasis
    public Camion parteDe;      // Referencia al Camión en el cual está incluído

    /* Constructor */
    public Chasis (Integer numero, Camion c) {
        this.numero = numero;
        this.parteDe = c;
    }
}
