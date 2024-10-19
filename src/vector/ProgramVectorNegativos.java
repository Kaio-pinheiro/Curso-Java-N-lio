package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = leia.nextInt();

		int[] vector = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número:");
			vector[i] = leia.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < N; i++) {
			if (vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}

		leia.close();
	}

}
