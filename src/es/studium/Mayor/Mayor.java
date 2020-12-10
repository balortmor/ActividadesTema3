package es.studium.Mayor;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {

		//Realizar un programa que lea 5 cadenas y nos diga cuál es la mayor de
		//ellas alfabéticamente.
		final int TAM = 5;
		String tabla[]= new String[TAM];
		String cadenaMayor;
		Scanner teclado =  new Scanner(System.in);

		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame la cadena de la posción " + i);
			tabla[i] = teclado.nextLine();
		}
		teclado.close();
		cadenaMayor=tabla[0];
		for (int i = 1; i < TAM; i++) {
			if (tabla[i].compareTo(cadenaMayor)>0) {
				cadenaMayor = tabla[i];
			}
		}
		System.out.println("La cadena mayor es: " + cadenaMayor);
	}
}
