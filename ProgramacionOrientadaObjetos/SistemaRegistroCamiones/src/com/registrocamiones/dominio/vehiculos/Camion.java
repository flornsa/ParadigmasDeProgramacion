package com.registrocamiones.dominio.vehiculos;

import com.registrocamiones.dominio.legal.Chofer;
import com.registrocamiones.dominio.legal.RNA;
import com.registrocamiones.dominio.legal.Titulo;
import com.registrocamiones.dominio.repuestos.Motor;

public class Camion {
    /* Atributos */
    protected String prop;
    public String marca;
    public Chasis formadoPor;       // Relación con Chasis
    private Chofer conduce;         // Relación con Chofer
    private Motor tieneUn;          // Relación con Motor
    private RNA inscripto;          // Relación con RNA

    /* Constructor: inicializa los atributos */
    public Camion (String p, String m, Integer chasis, Chofer chofer, Motor mo) {
        this.prop = p;
        this.marca = m;
        this.formadoPor = new Chasis(chasis, this);   // Relación de composición. Un Camión tiene un Chasis.
        this.conduce = chofer;
        this.tieneUn = mo;                               // Relación de agregación.
    }

    /* Constructor */
    public Camion (String p) {
        this.prop = p;
    }

    /* Métodos getter y setter */
    public String getProp() {
        return prop;
    }
    public void setProp() {
        this.prop = prop;
    }

    public Chofer getConduce() {
        return conduce;
    }
    public void setConduce( Chofer chofer) {
        this.conduce = chofer;
    }

    public Motor getTieneUn() {
        return tieneUn;
    }
    public void setTieneUn(Motor motor) {
        this.tieneUn = motor;
    }

    public RNA getInscripto() {
        return inscripto;
    }
    public void setInscripto(RNA inscripto) {
        this.inscripto = inscripto;
    }

    /* Otros métodos */

    public void registrar() {       // Establece el registro de un Camión en el RNA.
        // Crear un Título con este camión
        Titulo t = new Titulo(inscripto, prop, this);

        // Registrar este Título en el RNA
        inscripto.registrar(t);
    }

    @Override
    public String toString() {
        return  "Camión { " +
                "Propietario = '" + prop + '\'' +
                ", Marca = '" + marca + '\'' +
                ", Chasis = " + (formadoPor != null ? formadoPor.numero: "No asignado") +
                ", Chofer = " + (conduce != null ? conduce.getNombre() : "No asignado") +
                ", Motor = " + (tieneUn != null ? tieneUn.numero : "No asignado") +
                ", Registro = " + (inscripto != null ? inscripto.id : "No asignado") +
                " }";
    }
}
