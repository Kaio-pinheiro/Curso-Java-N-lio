package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite quantos números você quer dividir: ");
		int N = leia.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o " + (i + 1) + " º número:");
			int a = leia.nextInt();
			int b = leia.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = (double) a / b;
				System.out.println(divisao);
			}

		}
		leia.close();
	}

}
