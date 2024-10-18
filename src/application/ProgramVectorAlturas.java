package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int pessoasDigitadas = leia.nextInt();
		String[] nomes = new String[pessoasDigitadas];
		int[] idades = new int[pessoasDigitadas];
		double[] alturas = new double[pessoasDigitadas];

		for (int i = 0; i < pessoasDigitadas; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			nomes[i] = leia.next();
			System.out.print("Idade: ");
			idades[i] = leia.nextInt();
			System.out.print("Altura: ");
			alturas[i] = leia.nextDouble();
		}

		double somaAlturas = 0.0;
		for (int i = 0; i < pessoasDigitadas; i++) {
			somaAlturas += alturas[i];
		}

		double mediaAlturas = somaAlturas / pessoasDigitadas;
		int quantidadeMenosDe16 = 0;

		for (int i = 0; i < pessoasDigitadas; i++) {
			if (idades[i] < 16) {
				quantidadeMenosDe16++;
			}
		}
		double porcentagem = quantidadeMenosDe16 * 100 / pessoasDigitadas;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < pessoasDigitadas; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}

		leia.close();
	}

}
