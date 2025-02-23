package com.registrocamiones.dominio.legal;

import java.util.ArrayList;
import com.registrocamiones.dominio.vehiculos.Camion;

/* Representa una oficina Registro del Automotor */
public class RNA {
    /* Atributos */
    public final String id = "Mendoza";
    ArrayList<Titulo> titulos = new ArrayList<>();

    /* Métodos */

    /* Recibe un Título para registrarlo en el contenedor de Títulos */
    public void registrar (Titulo t) {
        titulos.add(t);
        t.setRna(this);       // Encapsulado el acceso directo a rna
    }

    /* Muestra el nombre del propietario de cada uno de los Títulos encontrados */
    public void mostrar() {

        for (Titulo t : titulos) {
            System.out.println(t);
        }

        // Otra forma:
        /*
        for (int i = 0; i < titulos.size(); i++) {
            Titulo t = titulos.get(i);
            System.out.println(t);
        }
        */
    }

}
