package es.studium.cambiarAporO;

import java.util.Scanner;

public class CambiarAporO {

	public static void main(String[] args) {

		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase:");
		frase = teclado.nextLine();
		teclado.close();
		frase = frase.replace('a', 'o');
		/*for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)=='a') {
				System.out.print("o");
			}else {
				System.out.print(frase.charAt(i));
			}
		}*/
		System.out.println(frase);
	}

}
