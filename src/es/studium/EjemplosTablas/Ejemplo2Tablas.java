package es.studium.EjemplosTablas;

import java.util.Scanner;

public class Ejemplo2Tablas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		final int TAM = 5;
		int i;
		int tabla[]= new int[TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de la tabla ["+i+"]");
			tabla[i]= teclado.nextInt();
		}
		teclado.close();
		for (i = 0; i < TAM; i++) {
			System.out.println(tabla[i]);
		}
	}
}
