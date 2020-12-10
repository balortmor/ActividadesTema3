package es.studium.Tablas2;

import java.util.Scanner;

public class Tablas2 {

	public static void main(String[] args) {

		final int TAM = 4;
		int[] tab = new int[TAM];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de tabla["+i+"]:");
			tab[i]=teclado.nextInt();
		}
		teclado.close();
		for (int i = 0; i < TAM; i++) {
			System.out.println(tab[i]);
		}for (int i = TAM-1; i >=0; i--) {
			System.out.println(tab[i]);
		}
	}

}
