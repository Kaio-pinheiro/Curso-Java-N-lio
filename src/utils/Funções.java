package utils;

import java.util.Scanner;

public class Funções {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		leia.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
