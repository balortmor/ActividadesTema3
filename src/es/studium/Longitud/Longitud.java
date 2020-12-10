package es.studium.Longitud;

import java.util.Scanner;

public class Longitud {

	public static void main(String[] args) {

		String cadena;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println("Longitud con espacios: "+ funlongitud(cadena));
		System.out.println("Longitud sin espacios: "+ sinEspacios(cadena));
	}

	public static int funlongitud(String c){

		return c.length();
	}
	public static int sinEspacios(String c) {

		int longitud = 0;
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i)!=' ') {
				longitud++;
			}
		}return longitud;

	}
}

