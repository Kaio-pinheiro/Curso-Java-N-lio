package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = leia.nextLine();
		System.out.print("Price: ");
		product.price = leia.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = leia.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product) ;
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = leia.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = leia.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		
		leia.close();
	}

}
