package es.studium.Tablas1;

public class Tablas1 {

	public static void main(String[] args) {

		final int TAM = 200;
		int pares[]= new int[TAM];
		for (int i = 0; i < TAM; i++) {
			pares[i]= i*2;
		}for (int i = 0; i < TAM; i++) {
			System.out.println(pares[i]);
		}
	}

}
