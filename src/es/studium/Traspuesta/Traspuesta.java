package es.studium.Traspuesta;

import java.util.Scanner;

public class Traspuesta {

	public static void main(String[] args) {

		final int FILAS = 3;
		final int COLUMNAS = 3;
		int tabla[][] = new int[FILAS][COLUMNAS];
		int traspuesta[][] = new int[FILAS][COLUMNAS];
		Scanner teclado =  new Scanner(System.in);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el número [" + i +"][" + j + "]");
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("La tabla traspuesta quedaría así: ");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				traspuesta[i][j]=tabla[j][i];
				System.out.print(traspuesta[i][j] + "\t");
			}System.out.println();
		}
	}

}
