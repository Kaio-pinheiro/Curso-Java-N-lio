package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramEmployeeList {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = leia.nextInt();
		
		for(int i = 0; i < n; i ++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = leia.nextInt();
			System.out.print("Name: ");
			leia.nextLine();
			String name = leia.nextLine();
			System.out.print("Salary: ");
			Double salary = leia.nextDouble();
			
			// Instancia na memoria um novo objeto Funcionario(EMPLOYEE) com esses argumentos e dps insere ele na lista
			EmployeeList emp = new EmployeeList(id, name, salary);
			list.add(emp);
			
		}
		System.out.println();
		System.out.print("Enter the employeee id that will have salary increase : ");
		int idsalary = leia.nextInt();
		// Procurando a posição do idsalary(funcionário que vai receber o aumento) dentro da lista
		// se nao encontrar vai retornar null e se retorna pergunto a porcentagem, a ser aumentada
		// ai vou acessar na lista o funcionario que esta na posicao que eu encontrei *pos* e vou chamar a função pra aumentar o salario dele
		Integer pos = position(list, idsalary); 
		if(pos == null) {
			System.out.println("This is id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = leia.nextDouble();
			//get(pos) acessa o funcionario que esta na posição pos e chama a função de aumentar o salario
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeList emp : list) {
			System.out.println(emp);
		}
		
		leia.close();
	}
	
	// Função pra procurar a posição do elemento na lista
	// vai percorrer a lista* list.size()* o tamanho dela, se o elemento da posição i *list.get(i)* .getId() 
	//ou seja peguei o id dele, se esse id for igual o id que forneci como argumento encontrou e a posiça~odele é a posição de i
	//;; usando int retorna -1 usando Integer retorna null
	public static Integer position(List<EmployeeList> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
