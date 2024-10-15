package random;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		/*Scanner leia= new Scanner(System.in);
		System.out.println("Olá mundo!");
		int id = 10;
		double salario = 5000.00;
		String nome = "Kaio";
		boolean verdade = true;
		boolean falso = false;
		double media = salario / id;
		System.out.println(id);
		System.out.printf("%.2f%n",salario);
		System.out.println(verdade);
		System.out.printf("%s%n",nome);
		System.out.printf("%.2f%n",media);
		System.out.printf("Valor Salário: %.2f reais.%n", salario);
		System.out.printf("%s do id %d tem um salario de %.2f%n", nome, id, salario, verdade );
		*/
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2= 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s , which price is $ %.2f%n", product1, price1);
		System.out.printf("%s , which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
	}
}