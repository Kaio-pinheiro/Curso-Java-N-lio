package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		// calcule e mostre a diferença do produto
		// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
		// D).

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor?");
		int A = leia.nextInt();
		System.out.println("Digite o segundo valor?");
		int B = leia.nextInt();
		System.out.println("Digite o terceiro valor?");
		int C = leia.nextInt();
		System.out.println("Digite o quarto valor?");
		int D = leia.nextInt();

		int soma = (A * B - C * D);
		System.out.println("DIFERENÇA = " + soma);

		leia.close();
	}

}
