package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class stream {
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		/*for(String s: lista)
			if(condicao.test(s))
				System.out.println(s);*/
		
		//iteração interna
		lista.stream().filter(condicao::test)
			.forEach(System.out::println);
	}
	public static void main(String[] args) {
		List<String> lista1 = Arrays.asList(
				"Santa Catarina", "Parana", "Sao Paulo",
				"Rio de Janeiro", "Brasilia", "Ceara"
		);
		 
		/*for(String s:lista1) 
			System.out.println(s);*/
		
		//lista1.forEach(x -> System.out.println(x));
		lista1.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Estados que iniciam com a letra S");
		filtro(lista1, (s)->s.startsWith("S"));
		System.out.println();
		
		System.out.println("Estados que finalizam com a letra a");
		filtro(lista1, (s)->s.endsWith("a"));
		System.out.println();
		
		System.out.println("Imprimindo toda a lista");
		filtro(lista1, (s)->true);
		System.out.println();
		
		System.out.println("Nao imprime a lista");
		filtro(lista1, (s)->false);
		System.out.println();
		
		System.out.println("Imprime os nomes com + de 10 caracteres");
		filtro(lista1, (s)->s.length() >= 10);
	}
}
