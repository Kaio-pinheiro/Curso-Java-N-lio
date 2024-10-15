package estrutura_repetitiva_while;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		// QUAL COMBUSTIVEL AS PESSOAS MAIS ABASTECEM

		Scanner leia = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int escolha = 0;
		System.out.println("Bem vindo aos Postos Galo, qual combustível você gostaria de abastecer? ");
		System.out.println("Escolha uma das opções (1, 2, 3 ou 4)");

		while (escolha != 4) {
			System.out.println("1. Alcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Fim");
			escolha = leia.nextInt();

			if (escolha >= 1 && escolha <= 3) {
				if (escolha == 1) {
					alcool++;
				} else if (escolha == 2) {
					gasolina++;
				} else if (escolha == 3) {
					diesel++;
				}
			} else if (escolha != 4) {
				System.out.println("Número inválido.Digite um número de 1 a 4: ");
			}

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Quantidade de clientes que abasteceram por combustivel");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		leia.close();
	}

}
