package es.studium.Subcadena;

import java.util.Scanner;

public class Subcadena {

	public static void main(String[] args) {

		String cadena;
		int posicion;
		int longitud;
		String resultado="";
		Scanner teclado =  new Scanner(System.in);

		System.out.println("Escribe una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Dame una posici�n: ");
		posicion = teclado.nextInt();
		System.out.println("Dame una longitud: ");
		longitud = teclado.nextInt();
		teclado.close();

		System.out.println(cadena.substring(posicion, posicion+longitud));

		for (int i = posicion; i < posicion+longitud; i++) {
			resultado = resultado+cadena.charAt(i);
		}System.out.println(resultado);
	}
}
