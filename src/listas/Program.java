package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// Cria uma lista chamada list
		List<String> list = new ArrayList<>();
		
		// Adiciona na lista 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Adiciona na lista na posição 2 o "Marco"
		list.add(2, "Marco");
		
		// Imprimi o tamanho da lista
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		// Remove da lista quem estievr na posição 1
		list.remove(1);
		// Remove da lista comparando a String "Anna" com alguma "Anna" na lista, se tiver duas, tem que remover duas vezes
		list.remove("Anna");
		// Remove todo mundo que começa com a letra 'M': se lê assim: quero remover todo string x tal que x.charAt na posição 0 seja igual a 'M'
		// se chama função lambda em predicado, vai retornar verdadeiro ou falso
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		
		// Encontrando a posição que o elemento está na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Quando o index nao encontra o elemento na lista, ele retorna -1
		System.out.println("Index of Jhow: " + list.indexOf("Jhow"));
		
		System.out.println("------------------");
		list.add("Amanda");
		list.add("Bob");
		list.add("André");
		list.add("Maria");
		list.add("Anderson");
		

		// Filtrar na lista somente quem tem o nome começado com 'A'
		// Declara uma nova lista, colocar o comando pra pegar a lista original, filtrar os elementos que começem com a letra 'A' por exemplo
		//e devolver uma nova lista somente com esses elemtnos
		// vai pegar a lista, converter pra stream, que é um tipo especial que aceita operações com expressões LAMBDA, ai chama a função filter que recebe um predicado
		// esse filter vai devolver um stream filtrado conforme este predicado, mas esse stream nao é compativel com List, pra fazer isso chama collect
		// então tem que pegar ele e converter denovo pra Lista
		// Resumindo: primeiro converte pra stream, faz a operação lambda e dps converte pra lista denovo
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		// Para encotnrar o primeiro elemnto que ocmece com a letra A
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
