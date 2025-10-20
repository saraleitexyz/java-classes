package recursion;

import java.util.Scanner;

/*
4. Longitud de una Cadena:
Implementa una función recursiva que calcule la longitud de una cadena
sin utilizar métodos predefinidos de longitud.
*/

public class Ejercicio04 {

    public static int longitudRecu(String texto) {
        if (texto.equals("")) {
            return 0;
        } else {
            return 1 + longitudRecu(texto.substring(1));
        }
    }

    /*
    public static int longitudIte(String texto) {
        //???
    }
    */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("LONGITUD DE UNA CADENA (versión recursiva)");
        System.out.println("------------------------------------------");
        System.out.print("Introduce una cadena: ");
        String texto = reader.nextLine();

        //System.out.println("Longitud (iterativa): " + longitudIte(texto));
        System.out.println("Longitud (recursiva): " + longitudRecu(texto));

        reader.close();
    }
}

