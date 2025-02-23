package numeroracional.modelo;

public class NumeroRacional {

    /* Atributos */                                 // Se inicializan en 0 por defecto
    private long numerador;
    private long denominador;

    /* Constructor */
    public NumeroRacional (long n, long d) {        // Se restringen a positivos
        numerador = n > 0 ? n : 0;
        denominador = d > 0 ? d : 0;
    }

    /* Constructor sobrecargado */
    public NumeroRacional () {
        numerador = 0;
        denominador = 0;
    }

    /* Constructor sobrecargado de copia */
    public NumeroRacional (NumeroRacional obj) {
        numerador = obj.numerador;
        denominador = obj.denominador;
    }


    /* Métodos */

    public void asignar (long n, long d) {          // Se restringen a positivos
        numerador = n > 0 ? n : 0;
        denominador = d > 0 ? d : 0;
    }

    public void asignar (NumeroRacional obj) {      // EN JAVA:
        if (obj != this) {                          // para evitar reasignar el mismo objeto, los objetos
            numerador = obj.numerador;              // de tipo no primitivo siempre se pasan por referencia
            denominador = obj.denominador;
        }
    }

    public boolean esIgual (NumeroRacional obj) {
        return numerador == obj.numerador && denominador == obj.denominador;
    }
}
