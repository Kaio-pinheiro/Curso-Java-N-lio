package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número do funcionario?!");
		int numero = leia.nextInt();
		System.out.println("Quantas horas você trabalhou?");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Quanto você recebe por hora?");
		double salarioPorHora = leia.nextDouble();

		double salario = horasTrabalhadas * salarioPorHora;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		leia.close();

	}

}
