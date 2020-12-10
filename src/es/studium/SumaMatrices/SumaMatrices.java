package es.studium.SumaMatrices;

import java.util.Scanner;

public class SumaMatrices {

	public static void main(String[] args) {

		final int FILAS = 3;
		final int COLUMNAS = 3;
		int tabla1[][] = new int[FILAS][COLUMNAS];
		int tabla2[][] = new int[FILAS][COLUMNAS];
		int suma[][] = new int[FILAS][COLUMNAS];
		Scanner teclado =  new Scanner(System.in);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el número [" + i +"][" + j + "]");
				tabla1[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el número [" + i +"][" + j + "]");
				tabla2[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("La suma de las dos matrices es igual a:");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				suma[i][j] = tabla1[i][j]+tabla2[i][j];
				System.out.print(suma[i][j] + "\t");
			}System.out.println();
		}
	}

}
