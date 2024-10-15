package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um número inteiro:");
		int numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		leia.close();
	}

}
