package numeroracional.test;
import numeroracional.modelo.NumeroRacional;

public class Prueba {
    public static void main (String [] args) {
        NumeroRacional a, b, c, d;
        a = new NumeroRacional();
        b = new NumeroRacional(3, 4);
        c = new NumeroRacional(b);
        d = new NumeroRacional(b);

        a.asignar(b);

        if (c.esIgual(d)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }
    }
}
