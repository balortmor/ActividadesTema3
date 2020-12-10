package es.studium.PosicionMaximo;

import java.util.Scanner;

public class PosicionMaximo {

	public static void main(String[] args) {

		final int TAM = 10;
		int tabla[] = new int[TAM];
		int maximo;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de la posición "+ i);
			tabla[i]= teclado.nextInt();
		}
		teclado.close();
		maximo =tabla[0];
		for (int i = 0; i < TAM; i++) {
			if (tabla[i]>maximo) {
				maximo = tabla[i];
			}
		}
		System.out.println("El valor máximo vale: " + maximo);
		for (int i = 0; i < TAM; i++) {
			if (tabla[i]==maximo) {
				System.out.println("Encontrado el máximo en " + i);
			}

		}
	}

}
