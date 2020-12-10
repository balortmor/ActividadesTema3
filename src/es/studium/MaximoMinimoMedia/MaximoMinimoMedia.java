package es.studium.MaximoMinimoMedia;

import java.util.Scanner;

public class MaximoMinimoMedia {

	public static void main(String[] args) {

		final int TAM = 10;
		int tabla[] = new int[TAM];
		float media = 0;
		int maximo;
		int minimo;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de la tabla[" + i + "]:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		maximo =tabla[0];
		minimo = tabla[0];
		for (int i = 0; i < tabla.length; i++) {
			
		}
		for (int i = 0; i < tabla.length; i++) {
			media = media + (float)tabla[i];
			if(tabla[i]>maximo) {
				maximo=tabla[i];
			}
			if(tabla[i]<minimo) {
				minimo = tabla[i];
		}
		}
		media = media/tabla.length;
		System.out.println("El máximo es " + maximo);
		System.out.println("El mínimo es " + minimo);
		System.out.println("La media es " + media);
	}
}
