package Fundamentos;

import javax.print.attribute.SupportedValuesAttribute;

public class HolaMundo {
    /**
     * @param args
     */
    public static void main(String args[]) {
        //Definimos la variable
         int miVarEntera = 10;
         System.out.println(miVarEntera);

         //Modificamos el valor de la variable;
         miVarEntera = 7;
         System.out.println(miVarEntera);

         String miVarCadena = "Saludos";
         System.out.println(miVarCadena);
         
         miVarCadena = "Adios";
         System.out.println(miVarCadena);

         //var - Inferencia de tipos en Java
         var miVarEntera2 = 26;
         System.out.println(miVarEntera2);

         var miVarCadena2 = "Nueva Cadena";
         System.out.println(miVarCadena2);
    }
}