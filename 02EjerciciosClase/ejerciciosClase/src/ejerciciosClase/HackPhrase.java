package ejerciciosClase;

/*
Este es un programa al que le pasas un string y, de este, y te lo encripta.
 */

import java.util.Scanner;

public class HackPhrase {
	
	public static String encryptPassword(String userPassword) {
		if (userPassword == null) return null;
		char[] letters = userPassword.toCharArray();
		for (int i = 0; i < userPassword.length(); i++) {
			String encryptedPassword = userPassword.replace(0, 0);
		}
		return encryptedPassword;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("ENCRIPTADORA DE CONTRASEÑAS:");
		System.out.println("-------------------------------------------------");
		System.out.println("Introduce una contraseña: ");
		String userPassword = reader.nextLine(); 
		System.out.println("Contraseña encriptada: "+ encryptPassword(userPassword));
		reader.close();
	}
}

