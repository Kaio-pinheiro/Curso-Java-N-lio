package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorAbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = leia.nextInt();

		double[] vector = new double[n];
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = leia.nextDouble();
			soma += vector[i];
		}
		System.out.println();
		double media = soma / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vector[i] < media) {
				System.out.println(vector[i]);
			}
		}

		leia.close();
	}

}
