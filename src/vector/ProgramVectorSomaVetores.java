package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorSomaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = leia.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			A[i] = leia.nextInt();

		}
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			B[i] = leia.nextInt();
		}

		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}

		leia.close();
	}

}
