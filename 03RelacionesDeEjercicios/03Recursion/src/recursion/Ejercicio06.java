package recursion;

/*
6. Suma de los Dígitos de un Número: Escribir un algoritmo recursivo que sume los dígitos de un número.
Ejemplo: Entrada 123, Resultado 6
 */

public class Ejercicio06 {
	public static int numRecu(int n) {
		if (n < 10) {
			return n;
		} else {
			return n%10 + numRecu(n/10);
		}
	}
	
	public static int numIte(int n) {
		int acum = 0;
		//terminar
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		String num = teclado.nextLine();
		System.out.println(numRecu(num));
		System.out.println(numIte(num));
		teclado.close();
	}
}
