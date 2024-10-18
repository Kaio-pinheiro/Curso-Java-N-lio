package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int n = leia.nextInt();

		int[] vector = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vector[i] = leia.nextInt();
		}
		int pares = 0;
		System.out.println();
		System.out.println("NÚMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (vector[i] % 2 == 0) {
				System.out.print(vector[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);

		leia.close();
	}

}
