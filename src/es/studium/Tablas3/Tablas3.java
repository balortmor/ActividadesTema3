package es.studium.Tablas3;

import java.util.Scanner;

public class Tablas3 {

	public static void main(String[] args) {

		int tabla[][] = new int[5][5];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Ingrese el valor de la posición ("
						+ i +","+j+"):");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Tabla["+i+"]["+j+"]="+ tabla[i][j]);
			}
		}teclado.close();
	}

}
