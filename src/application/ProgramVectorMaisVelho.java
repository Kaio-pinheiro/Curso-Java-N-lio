package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorMaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = leia.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double maisVelho = idades[0];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da "+ (i +1) + "ª pessoa:");
			System.out.print("Nome: ");
			nomes[i] = leia.next();
			System.out.print("Idade: ");
			idades[i] = leia.nextInt();
		}
		
		int nomeMaior = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
				nomeMaior = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nomes[nomeMaior]);
		
		
		leia.close();
	}

}
