package LetraPorPosicion;

import java.util.Scanner;

public class LetraPorPosicion {

	public static void main(String[] args) {
		final int FILAS =3;
		final int COLUMNAS=3;
		char tabla[][]=new char[FILAS][COLUMNAS];
		int resultado[][]=new int[FILAS][COLUMNAS];
		Scanner teclado =  new Scanner(System.in);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.println("Dame el carácter [" + i +"][" + j + "]");
				tabla[i][j] = teclado.nextLine().charAt(0);
			}
		}
		teclado.close();	
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				resultado[i][j] = tabla[i][j]-96;
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
