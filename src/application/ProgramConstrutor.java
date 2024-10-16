package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductConstrutor;

public class ProgramConstrutor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = leia.nextLine();
		System.out.print("Price: ");
		double price = leia.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = leia.nextInt();
		ProductConstrutor productConstrutor = new ProductConstrutor(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + productConstrutor);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = leia.nextInt();
		productConstrutor.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + productConstrutor);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = leia.nextInt();
		productConstrutor.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + productConstrutor);

		leia.close();
	}

}
