package Fundamentos;

import javax.print.attribute.SupportedValuesAttribute;

public class HolaMundo {
    /**
     * @param args
     */
    public static void main(String args[]) {
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre );
        System.out.println("Comilla simple: \'" + nombre + "'" );
        System.out.println("Comilla Doble: \"" + nombre + "\" ");
    }
}