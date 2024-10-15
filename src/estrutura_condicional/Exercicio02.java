package estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um númweo inteiro:");
		int numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		leia.close();
	}
}
