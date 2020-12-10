package es.studium.Simetrica;

import java.util.Scanner;

public class Simetrica {

	public static void main(String[] args) {

		final int FILAS = 3;
		final int COLUMNAS = 3;
		int tabla[][] = new int[FILAS][COLUMNAS];
		int coincidencias=0;
		Scanner teclado =  new Scanner(System.in);
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el n�mero [" + i +"][" + j + "]");
				tabla[i][j] = teclado.nextInt();
			}
		}teclado.close();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (tabla[i][j]==tabla[j][i]) {
					coincidencias++;
				}System.out.print(tabla[i][j] + "\t");
			}System.out.println();
		}if (coincidencias==FILAS*COLUMNAS) {
			System.out.println("La tabla S� es sim�trica");
		}else {System.out.println("La tabla NO es sim�trica");
		}
	}

}
