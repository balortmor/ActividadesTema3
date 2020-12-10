package es.studium.Igualdad;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) {

		String cadena1,cadena2;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe la primera cadena: ");
		cadena1= teclado.nextLine();
		System.out.println("Escribe la segunda cadena: ");
		cadena2= teclado.nextLine();
		teclado.close();
		if (cadena1.contentEquals(cadena2)) {
			System.out.println("Las cadenas son iguales.");
		}else {
			System.out.println("Las cadenas son diferentes.");
		}
	}
}
