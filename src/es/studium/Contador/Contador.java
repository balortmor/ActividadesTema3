package es.studium.Contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		final int TAM = 2;
		int contador[] = new int[TAM];
		//contador[0] es de numeros negativos
		//contador[1] es de numeros positivos
		Scanner teclado = new Scanner (System.in);
		int numero;
		do {
			System.out.println("Pasame un número");
			numero = teclado.nextInt();
			if (numero<0) {
				contador[0]++;
			}else if (numero>0) {
				contador[1]++;
			}
		} while (numero!=0);
		teclado.close();
		System.out.println("Has introducido " + contador[0]+ " negativos.");
		System.out.println("Has introducido " + contador[1]+ " positivos.");
	}

}
