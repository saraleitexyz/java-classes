package eclipseHater;

/*
1. Crea un array de 10 enteros, inicialízalo con los valores 1..10 e imprime sus elementos 
y su suma.
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int totalSum = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("v[" + i + "] = " + numeros[i]);
			totalSum += numeros[i];
		}
		System.out.println("La suma de sus valores es: " + totalSum);
	}
}
