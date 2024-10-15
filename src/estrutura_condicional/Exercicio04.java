package estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a hora inicial do jogo");
		int horaInicial = leia.nextInt();
		System.out.println("Digite a hora final do jogo");
		int horaFinal = leia.nextInt();
		int total;
		
		if (horaInicial < horaFinal) {
			total = horaFinal - horaInicial;
		} else {
			total = (24 - horaInicial) + horaFinal;
		}
		if(total ==0) {
			total = 24;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S).");
		
		leia.close();
		
	}
}
