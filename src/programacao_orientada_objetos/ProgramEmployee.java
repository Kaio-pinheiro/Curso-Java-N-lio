package programacao_orientada_objetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = leia.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = leia.nextDouble();
		System.out.print("Tax: ");
		employee.tax = leia.nextDouble();

		System.out.println();
		System.out.printf("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = leia.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.printf("Updated data: " + employee);

		leia.close();
	}

}
