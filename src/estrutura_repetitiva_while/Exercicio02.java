package estrutura_repetitiva_while;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a coordenada x: ");
		int x = leia.nextInt();

		System.out.println("Digite a coordenada y: ");
		int y = leia.nextInt();

		while (true) {

			if (x == 0 || y == 0) {
				break;
			}
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
				break;
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
				break;
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
				break;
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
				break;
			} else {

			}
		}
		leia.close();
	}

}
