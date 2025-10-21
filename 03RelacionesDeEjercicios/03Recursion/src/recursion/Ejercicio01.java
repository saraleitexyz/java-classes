package recursion;

/*
1. Potencia de un Número: Diseñar un método recursivo que calcule la 
potencia de un número real x elevado a un exponente entero n.
*/

public class Ejercicio01 {
	public static long potiter(int num, int pot) {
		int total = 1;
		for (int i = 0; i < pot; i++) {
			total = total * num;
		}
		return total;
	}
	
	public static int potrec(int num, int pot) {
		// Caso base:
		if (pot == 0) {
			return 1;
		// Caso general:
		} else {
			return (num * potrec(num, pot - 1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(potiter(5,9));
		System.out.println(potrec(5,9));
	}

}
