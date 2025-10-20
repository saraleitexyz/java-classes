package recursion;

/*
3. División por Restas Sucesivas:
Implementar un algoritmo recursivo que permita realizar la división entre
dos números usando restas sucesivas.
*/

import java.util.Scanner;

public class Ejercicio03 {
    public static int divIte(int dividendo, int divisor) {
        int cociente = 0;
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        System.out.println("División iterativa: " + cociente);
        return cociente;
    }

    public static int divRecu(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + divRecu(dividendo - divisor, divisor);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("DIVISIÓN POR RESTAS SUCESIVAS");
        System.out.println("------------------------------");

        System.out.print("Introduce el dividendo: ");
        int dividendo = reader.nextInt();

        System.out.print("Introduce el divisor: ");
        int divisor = reader.nextInt();

        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        } else {
            divIte(dividendo, divisor);
            System.out.println("División recursiva: " + divRecu(dividendo, divisor));
        }

        reader.close();
    }
}
