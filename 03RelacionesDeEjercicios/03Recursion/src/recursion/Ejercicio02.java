package recursion;

/*
2. Suma de los N Primeros Números Naturales: 
Crear un método recursivo que calcule la suma de los primeros N números naturales
 */

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void sumaIte(int userNum) {
		int suma = 0;
        for (int i = 1; i <= userNum; i++) {
            suma += i;
        }
        System.out.println("Suma iterativa: " + suma);
	}
	
	public static int sumaRecu(int userNum) {
		if (userNum <= 1) {
            return userNum;
        } else {
            return userNum + sumaRecu(userNum - 1);
        }
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE LA SUMA DE LOS PRIMEROS N NUMEROS:");
		System.out.println("-------------------------------------------------");
		System.out.println("Introduce un número: ");
		int n = reader.nextInt(); 
		sumaIte(n);
		System.out.println("Suma recursiva: "+ sumaRecu(n));
		reader.close();
	}
}
