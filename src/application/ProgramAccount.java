package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = leia.nextInt();
		
		System.out.print("Enter account holder: ");
		leia.nextLine();
		String holder = leia.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = leia.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = leia.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = leia.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = leia.nextDouble();
		account.withdraw(withDrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		leia.close();
	}

}
