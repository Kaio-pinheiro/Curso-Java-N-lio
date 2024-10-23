package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor da área deste círculo com quatro casas decimais conforme exemplos
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do raio:");
		double raio = leia.nextDouble();

		double area = 3.14159 * (raio * raio);
		System.out.printf("A=%.4f%n", area);

		leia.close();
	}

}
