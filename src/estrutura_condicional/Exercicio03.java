package estrutura_condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número para A:");
		int A = leia.nextInt();
		System.out.println("Digite um número para B:");
		int B = leia.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}

		leia.close();

	}
}
