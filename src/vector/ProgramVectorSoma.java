package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorSoma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos números voce vai digitar: ");
		int N = leia.nextInt();
		double[] vector = new double[N];
		double soma = 0.0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vector[i] = leia.nextDouble();
			soma += vector[i];

		}
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < N; i++) {
			System.out.print(vector[i] + " ");
		}

		System.out.println();
		double media = soma / N;

		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);

		leia.close();
	}

}
