package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// Ler um número inteiro N e calcular todos os seus divisores.

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = leia.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0)
				System.out.println(i);
		}
		leia.close();
		
	}

}
