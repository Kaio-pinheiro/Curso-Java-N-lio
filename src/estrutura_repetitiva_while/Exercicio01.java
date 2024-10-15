package estrutura_repetitiva_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int tentativas = 0;
		
	
		
		while(tentativas != senhaCorreta) {
			System.out.println("Digite sua senha:");
			int senhaDigitada = leia.nextInt();
			tentativas = senhaDigitada;
			
			if(senhaDigitada != senhaCorreta) {
				System.out.println("Acesso inválido");
			} else {
				System.out.println("Acesso permitido");
			}
		}
		
		leia.close();
	}

}
