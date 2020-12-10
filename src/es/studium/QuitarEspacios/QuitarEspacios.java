package es.studium.QuitarEspacios;

import java.util.Scanner;

public class QuitarEspacios {

	public static void main(String[] args) {

		String cadena;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Dame una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println(cadena.replace(" ",""));
	}

}
