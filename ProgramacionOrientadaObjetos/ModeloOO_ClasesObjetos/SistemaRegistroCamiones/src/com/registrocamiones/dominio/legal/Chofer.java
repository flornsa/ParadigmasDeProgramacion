package com.registrocamiones.dominio.legal;

// Representa el Chofer asociado a un determinado Camión
public class Chofer {
    /* Atributos */
    private String nombre;
    private String licencia;    // Número de licencia de conducir
    private int experiencia;    // Años de experiencia del Chofer

    /* Constructor */
    public Chofer (String nom, String lic, int exp) {
        this.nombre = nom;
        this.licencia = lic;
        this.experiencia = exp;
    }

    /* Métodos getter y setter */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String l) {
        this.licencia = l;
    }

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int e) {
        this.experiencia = e;
    }

    /* Método toString para imprimir información del chofer */
    @Override
    public String toString() {
        return  "Chofer { " +
                "Nombre = " + nombre + '\'' +
                ", Licencia = " + licencia + '\'' +
                ", Experiencia = " + experiencia + "años" +
                '}';
    }
}
