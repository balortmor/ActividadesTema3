package es.studium.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {

		String cadena1,cadena2;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Escribe la primera cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe la segunda cadena: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.equals(cadena2)) {
			System.out.println("Son iguales");
		}else if(cadena1.compareTo(cadena2)>0) {
			System.out.println("La primera cadena es mayor.");
		}else {
			System.out.println("La segunda cadena es mayor.");
		}
	}
}
