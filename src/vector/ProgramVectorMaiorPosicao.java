package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vector = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
		}
		double maiorValor = vector[0];
		int posicaoMaior = 0;
		for (int i = 0; i < n; i++) {
			if (vector[i] > maiorValor) {
				maiorValor = vector[i];
				posicaoMaior = i;
			}
		}
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);

		sc.close();
	}

}
