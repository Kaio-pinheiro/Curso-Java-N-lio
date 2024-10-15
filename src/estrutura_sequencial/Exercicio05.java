package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		

		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		// valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o código da peça 1:");
		int codigoPeca1 = leia.nextInt();
		System.out.println("Digite o número de peças 1:");
		int numeroPecas1 = leia.nextInt();
		System.out.println("Digite o valor unitário de cada peça 1:");
		double valorPeca1 = leia.nextDouble();
		
		System.out.println("Digite o código da peça 2:");
		int codigoPeca2 = leia.nextInt();
		System.out.println("Digite o número de peças 2:");
		int numeroPecas2 = leia.nextInt();
		System.out.println("Digite o valor unitário de cada peça 2:");
		double valorPeca2 = leia.nextDouble();
		
		double total = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total );
		
		// Só pra usar eles
		System.out.println(codigoPeca1 + codigoPeca2 );
		
		leia.close();
		
	}

}
