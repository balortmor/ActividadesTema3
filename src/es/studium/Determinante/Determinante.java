package es.studium.Determinante;

import java.util.Scanner;

public class Determinante {

	public static void main(String[] args) {
		final int FILAS =3;
		final int COLUMNAS=3;
		int tabla[][]=new int[FILAS][COLUMNAS];
		int determinante=1;
		Scanner teclado =  new Scanner(System.in);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el carácter [" + i +"][" + j + "]");
				tabla[i][j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		int j=0;
		for (int i = 0; i < FILAS; i++) {
			determinante= determinante*tabla[i][j];
			j++;
		}
		for (int i = FILAS; i > 0; i--) {
			determinante=determinante-tabla[i][j];
			j++;
		}
	}

}
