package recursion;

/*
5. Eliminar Vocales de una Cadena: Diseña una función recursiva que elimine todas las vocales de una cadena.
Por ejemplo, dado el string "recursión", la salida debería ser "rcrsón".
 */

public class Ejercicio05 {

	public static String quitarVocales(String cad) {
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
	
	/*
	public static String cadVocal(String cadena, int cont) {
		if (cont >= cadena.lenght())
			return "";
		char character = cadena.toLowerCase().charAt(cont);
		boolean vocal = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
		if (!vocal)
			return caracter + cadVocal(cadena, cont +1);
		else
			return cadVocal(cadena, cont+1);
	}
	*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String cadena = teclado.nextLine();
		System.out.println(quitarVocales(cadena));
		teclado.close();
	}
}
