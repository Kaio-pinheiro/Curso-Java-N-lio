package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor N:");
		int N = leia.nextInt();

		long fatorial = calcularFatorial(N);
		System.out.println(fatorial);
		
		leia.close();

	}

	public static long calcularFatorial(int n) {
		if (n == 0) {
			return 1;
		}

		long resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;

	}

}
