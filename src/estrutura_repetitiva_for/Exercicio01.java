package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 1000");
		int X = leia.nextInt();
		if (!(X >= 1 && X <= 1000)) {
			System.out.println("Número inválido, digite um número entre 1 e 1000!");
			X = leia.nextInt();
		}

		for (int i = 1; i < X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		leia.close();
	}

}
