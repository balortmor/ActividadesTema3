package es.studium;

import java.util.Scanner;

public class Ejemplo3Tablas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		final int TAM = 5;
		int i;
		int tabla[]= new int[TAM];
		float tablaResultado[]= new float[TAM];
		for (i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de la tabla ["+i+"]");
			tabla[i]= teclado.nextInt();
		}teclado.close();
		for (i = 0; i < TAM; i++) {
			tablaResultado[i]= (float)tabla[i]/2;
		}for (i = 0; i < TAM; i++) {
			System.out.println(tablaResultado[i]);
		}
	}

}

