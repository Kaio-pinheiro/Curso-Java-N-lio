package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class ProgramCurrency {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valorDolar = leia.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dolarComprado = leia.nextDouble();
		
		// Chamando o método estático diretamente
		double amoutToBePaid = CurrencyConverter.converter(valorDolar, dolarComprado);
		System.out.printf("Amount to be paid in reais = %.2f%n", amoutToBePaid);
		
		leia.close();
	}

}
