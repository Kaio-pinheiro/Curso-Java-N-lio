package random;
import java.util.Locale;

public class formatacao_printf {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double media = 53.23456700;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n",produto1, preco1);
		System.out.printf("%s, which price is $ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", idade, codigo, sexo);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%n", media);
		System.out.printf("Rouded (three decimal places): %.3f%n", media);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", media);
		/*
		%d: para formatação de valores inteiros.
		%f: para formatação de valores de ponto flutuante (números decimais).
		%s: para formatação de strings.
		%c: para formatação de caracteres.
		%b: para formatação de valores booleanos.
		%n: para inserir uma quebra de linha.
		*/
	}

}
