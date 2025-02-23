package com.miempresa.transporte.model;

public class Camion {
    /* Atributos */
    public final String marca;
    private float carga;
    private String propietario;

    /* Métodos o comportamientos */

    /* Constructor */
    public Camion (String marca, float carga, String prop) {
        this.marca = marca;
        this.carga = carga;
        this.propietario = prop;
    }

    /* Constructor copia
     * construye un objeto como una copia de otro*/
    public Camion (Camion obj) {
        this.marca = obj.marca;
        this.carga = obj.carga;
        this.propietario = obj.propietario;
    }

    public void setCarga (int kg) {
        if (carga > 0) {
            this.carga = kg;
        }
    }

    public float getCarga () {
        return carga;
    }

    public void setProp (String prop) {
        if (prop != "") {
            this.propietario = prop;
        }
    }

    public String getProp () {
        return this.propietario;
    }

    public void arrancar () {
        System.out.println("Arranca camión: " + marca);
    }

    public void parar () {
        System.out.println("Detiene camión");
    }

    public void cargarCombustible () {
        System.out.println("Carga combustible");
    }

    public void registrarPropietario (String prop) {
        propietario = prop;
        System.out.println("Registra propietario: " + propietario);
    }

    @Override
    public String toString() {
        return "Camion {" +
                "marca='" + marca + '\'' +
                ", carga=" + carga + " toneladas" +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
