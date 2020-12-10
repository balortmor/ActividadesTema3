package es.studium.Nombres;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		String nombre1,nombre2,nombre3,nombre4,nombre5;

		System.out.println("Escribe el primer nombre: ");
		nombre1= teclado.nextLine();
		System.out.println("Escribe el segundo nombre: ");
		nombre2= teclado.nextLine();
		System.out.println("Escribe el tercero nombre: ");
		nombre3= teclado.nextLine();
		System.out.println("Escribe el cuarto nombre: ");
		nombre4= teclado.nextLine();
		System.out.println("Escribe el quinto nombre: ");
		nombre5= teclado.nextLine();
		teclado.close();

		System.out.println("El primer nombre es " + nombre1);
		System.out.println("El segundo nombre es " + nombre2);
		System.out.println("El tercero nombre es " + nombre3);
		System.out.println("El cuarto nombre es " + nombre4);
		System.out.println("El quinto nombre es " + nombre5);
		System.out.println(String.format("Las cadenas son '%s', '%s', '%s', '%s' y '%s'",
				nombre1, nombre2, nombre3, nombre4, nombre5));
	}
}
