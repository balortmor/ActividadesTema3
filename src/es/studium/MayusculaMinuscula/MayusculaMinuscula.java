package es.studium.MayusculaMinuscula;

import java.util.Scanner;

public class MayusculaMinuscula {

	public static void main(String[] args) {

		String cadena;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println("En minúscula: " + cadena.toLowerCase());
		System.out.println("En mayúscula: " + cadena.toUpperCase());
	}

}
