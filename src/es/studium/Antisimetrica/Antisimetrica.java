package es.studium.Antisimetrica;

import java.util.Scanner;

public class Antisimetrica {

	public static void main(String[] args) {

		final int FILAS = 3;
		final int COLUMNAS = 3;
		int tabla[][] = new int[FILAS][COLUMNAS];
		boolean antisimetrica = true;
		Scanner teclado =  new Scanner(System.in);
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el número [" + i +"][" + j + "]");
				tabla[i][j] = teclado.nextInt();
			}
		}teclado.close();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (tabla[i][j]!=tabla[j][i]*-1) {
					antisimetrica=false;
				}System.out.print(tabla[i][j] + "\t");
			}System.out.println();
		}
		if (antisimetrica) {
			System.out.println("La tabla SÍ es antisimétrica");
		}else {System.out.println("La tabla NO es antisimétrica");
		}
	}

}
