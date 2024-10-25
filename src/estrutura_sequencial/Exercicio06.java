package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		double A = leia.nextDouble();
		System.out.println("Digite o segundo valor:");
		double B = leia.nextDouble();
		System.out.println("Digite o terceiro valor:");
		double C = leia.nextDouble();

		double triangulo = (A * C) / 2;
		double circulo = (C * C) * 3.14159;
		double trapezio = ((A + B) * C) / 2;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
				triangulo, circulo, trapezio, quadrado, retangulo);

		leia.close();
	}

}
