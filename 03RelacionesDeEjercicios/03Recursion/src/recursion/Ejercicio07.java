package recursion;

/*
7. Conteo de Vocales en una Cadena: Diseña un método recursivo que cuente el número de vocales en una
cadena dada. Esto te ayudará a comprender cómo recorrer una cadena de forma recursiva y aplicar
condiciones específicas.
 */

public class Ejercicio07 {

	public static String contarVocales(String cad) {
		if (cad.equals("")) {
			return "";
		} else {
			char c = cad.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				return quitarVocales(cad.substring(1));
			else
				return c+quitarVocales(cad.substring(1);
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String cadena = teclado.nextLine();
		System.out.println(contarVocales(cadena));
		teclado.close();
	}
}
