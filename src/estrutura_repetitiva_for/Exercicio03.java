package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		peso 5.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = leia.nextInt();
	
		for (int i = 0; i < n; i++) {
			double nota1 = leia.nextDouble();
			double nota2 = leia.nextDouble();
			double nota3 = leia.nextDouble();
			double media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10;
			System.out.printf("%.1f%n", media);
		}

		leia.close();
	}

}
