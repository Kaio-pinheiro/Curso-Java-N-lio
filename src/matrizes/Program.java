package matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = leia.nextInt();
		int[][] mat = new int[n][n];

		// TROQUEI n por mat.length
		// TROQUEI n por mat[i].length
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = leia.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		leia.close();
	}

}
