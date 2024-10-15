package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int primeiro = leia.nextInt();
		System.out.println("Digite o segundo número:");
		int segundo = leia.nextInt();
		
		int soma = primeiro + segundo;
		System.out.println("SOMA = " + soma);
		
		
		leia.close();
		
	}

}
