package es.studium.Suma2;

import java.util.Scanner;

public class Suma2 {

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner(System.in);
		int longitud;
		int suma = 0;
		System.out.println("Cu�nto mide la tabla?: ");
		longitud=teclado.nextInt();
		int tabla[]=new int[longitud];
		for (int i = 0; i < longitud; i++) {
			System.out.println("Dame el n�mero situado en la posici�n [" + i +"]");
			tabla[i] = teclado.nextInt();
			suma = suma + tabla[i];
		}
		teclado.close();
		System.out.println("La suma del vector es igual a " + suma);
	}
}
