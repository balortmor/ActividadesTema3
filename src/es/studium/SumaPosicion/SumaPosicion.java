package es.studium.SumaPosicion;

public class SumaPosicion {

	public static void main(String[] args) {

		final int TAM = 10;
		int tabla[][] = new int[TAM][TAM];
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				tabla[i][j] = i+j;
			}
		}for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
