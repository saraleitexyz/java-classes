package eclipseHater;

/*
2. Dado un array de dobles, calcula la media y cuenta cuántos elementos están 
por encima de la media.
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		double[] numbers = {1.2, 3.4, 5.6, 7.5, 8.9};
		double avg = 0;
		int startingPosition = 0;
		int aboveavg = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			avg += numbers[i];
		}
		
		avg = avg/numbers.length;
		
		System.out.println("La media es: " + avg);
		
		// Quiero que j sea igual a la primera posicion con el valor por encima de la media.
		for (int j = 0; numbers[j] <= avg ; j++) {
			startingPosition++;
		}
		
		for (int j = startingPosition; j < numbers.length; j++) {
			aboveavg++;
		}
		
		System.out.printf("Hay %d elementos por encima de la media.", aboveavg);
	}
}
