package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número positivo");
		int N = leia.nextInt();
		
		for(int i =1; i <= N; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d, %d, %d%n", primeiro, segundo, terceiro);
		
		}
		leia.close();
	}

}
