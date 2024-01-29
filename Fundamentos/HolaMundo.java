package Fundamentos;

import java.util.Scanner;

public class HolaMundo {
    /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine(); // lee una linea completa de la consola
        System.out.println(usuario);
        System.out.println("Escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}