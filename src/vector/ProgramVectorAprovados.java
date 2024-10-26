package vector;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorAprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] nota1Trimestre = new double[n];
		double[] nota2Trimestre = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1Trimestre[i] = sc.nextDouble();
			nota2Trimestre[i] = sc.nextDouble();

		}

		System.out.println("Alunos aprovados: ");
		double media;
		for (int i = 0; i < n; i++) {
			media = (nota1Trimestre[i] + nota2Trimestre[i]) / 2;
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}

}
