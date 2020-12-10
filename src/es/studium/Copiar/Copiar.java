package es.studium.Copiar;

import java.util.Scanner;

public class Copiar {

	public static void main(String[] args) {

		String cadena;
		String copia;
		Scanner teclado =  new Scanner(System.in);

		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		copia=cadena;
		System.out.println(cadena);
		System.out.println(copia);
	}

}
