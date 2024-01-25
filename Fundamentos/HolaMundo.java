package Fundamentos;

import javax.print.attribute.SupportedValuesAttribute;

public class HolaMundo {
    /**
     * @param args
     */
    public static void main(String args[]) {
        var usuario = "Angel";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println(union);

        var i = 3;
        var j = 4;
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + " " + usuario); // evaluacion de izquierda a derecha realiza suma
        System.out.println(usuario + (i + j)); // uso de parentesis modifican la prioridad en la evaluacion
    }
}