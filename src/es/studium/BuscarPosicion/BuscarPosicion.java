package es.studium.BuscarPosicion;

import java.util.Scanner;

public class BuscarPosicion {

	public static void main(String[] args) {

		String frase;
		char letra;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();
		System.out.println("Escribe la letra a buscar: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
		System.out.println(frase.indexOf(letra));
	}

}
