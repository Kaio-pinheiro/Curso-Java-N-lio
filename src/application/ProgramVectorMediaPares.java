package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorMediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = leia.nextInt();

		int[] vector = new int[n];
		int numerosPares = 0;
		double somaPares = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = leia.nextInt();
			if (vector[i] % 2 == 0) {
				somaPares += vector[i];
				numerosPares++;
			}
		}

		if (numerosPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = (double) somaPares / numerosPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}

		leia.close();
	}

}
