package com.registrocamiones.dominio.legal;

import java.util.Date;
import com.registrocamiones.dominio.vehiculos.Camion;

/* Representa un título de propiedad y materializa la relación
 * entre un Registro del Automotor y el Camión que ha sido comprado
 */
public class Titulo {               // Clase Asociativa
    /* Atributos */
    private String prop;            // Atributo encapsulado
    public RNA rna;                 // Una relación entre clases
    private Date diaInscripcion;    // Agregar en el diagrama de clases
    Camion c;

    /* Constructor */
    public Titulo (RNA rna, String prop, Camion c) {
        this.prop = prop;
        this.rna = rna;
        diaInscripcion = new Date();    // Hoy
        this.c = c;
    }

    /* Métodos getter y setter */
    public String getProp() {
        return prop;
    }
    public void setProp() {
        this.prop = prop;
    }

    public RNA getRna() {
        return  rna;
    }
    public void setRna(RNA rna) {
        this.rna = this.rna;
    }

    public Date getDiaInscripcion() {
        return  diaInscripcion;
    }

    public Camion getCamion() {
        return  c;
    }

    @Override
    public String toString() {
        return  "Título { " +
                "Propietario = " + prop + '\'' +
                ", Registro del Automotor = " + (rna != null ? rna.id : "No asignado") +
                ", Fecha de Inscripción = " + diaInscripcion +
                ", Camión = " + (c != null ? c.toString() : "No asignado") +
                '}';
    }
}
