package programacao_orientada_objetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Digite seu nome: ");
		String name = leia.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite as notas do " + (i + 1) + "º trimestre");
			double notas = leia.nextDouble();
			student.listaNotas.add(notas);
		}

		System.out.printf("FINAL GRADE = %.2f%n", student.media());
		student.result();

		System.out.println(name);// Só pra utilizar e sair o aviso de inutilizavel

		leia.close();
	}

}
