package es.studium.CambiarAporHA;

import java.util.Scanner;

public class CambiarAporHA {

	public static void main(String[] args) {

		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase:");
		frase = teclado.nextLine();
		teclado.close();
		frase = frase.replaceAll("a", "ha");
		/*for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)=='a') {
				System.out.print("ha");
			}else {
			System.out.print(frase.charAt(i));
			}
		}*/
		System.out.println(frase);
	}

}
