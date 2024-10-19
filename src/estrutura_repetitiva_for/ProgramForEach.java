package estrutura_repetitiva_for;

public class ProgramForEach {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria" , "Bob", "Alex"};
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		
		// Forma que se lê é "Para cada objeto obj contido no vetor vect, faça:"
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
