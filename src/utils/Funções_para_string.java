package utils;

public class Funções_para_string {

	public static void main(String[] args) {
		/*
		 * Funções mais utilizadas
		 * Formatar: toLowerCase(), toUpperCase(), trim()
		 * Recortar: substring(inicio), substring(inicio, fim)
		 * Substituir: Replace(char, char), Replace(string, string)
		 * Buscar: IndexOf, LastIndexOf
		 * str.Split(" ")
		 */
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01= original.toLowerCase();
		String s02= original.toUpperCase();
		String s03= original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println();										
		System.out.println("toLowerCase: -" + s01 + "-"); 			// Para letras minusculas
		System.out.println("toUpperCase: -" + s02 + "-");			// Para letras maiusculas
		System.out.println("trim: -" + s03 + "-");		 			// Remove os espaços
		System.out.println("substring(2): -" + s04 + "-");			// Imprimir apartir do caractere estipulado como parametro, no caso apartir do segundo neste exemplo
		System.out.println("substring(2, 9): -" + s05 + "-");		// Imprimir apartir do segundo caractere até o 9º caracter
		System.out.println("replace('a', 'x'): -" + s06 + "-");		// Troca o caracter no exemplo aqui está trocando 'a' por 'x'
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");  // Troca a string 'abc' por 'xy'
		System.out.println("Index of 'bc': " + i);					// Encontrar a primeira posição do 'bc' que neste exemplo será 1
		System.out.println("Last index of 'bc': " + j);				// Encontrar a última posição de 'bc' que neste exemplo será posição 17
		
		//Operação split - Separa a frase colocando cada palava em uma posição do vetor
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
	}

}
