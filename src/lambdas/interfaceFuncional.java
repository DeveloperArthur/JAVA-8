package lambdas;

public class interfaceFuncional {
	
	interface Num{
		double getValue();
	}
	
	interface ValorNumerico{
		boolean verificaSeEhPar(int n);
	}
	
	interface ValorNumerico2{
		boolean teste(int n, int n2);
	}
	
	public static void main(String[] args) {
		//Expressao lambda utilizada como uma constante
		Num n;
		n = () -> 555.11;
		System.out.println("Valor n = "+n.getValue());
		System.out.println();
		
		//Utilização da classe math com a estrutura lambda
		Num n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
		System.out.println();
		
		ValorNumerico isPar = (int i) -> (i%2)==0;
		System.out.println(isPar.verificaSeEhPar(89));
		System.out.println(isPar.verificaSeEhPar(90));
		System.out.println();
		
		ValorNumerico2 isDiv = (x, y) -> (x%y)==0;
		System.out.println(isDiv.teste(10, 2));
		System.out.println(isDiv.teste(10, 3));
		System.out.println();
		
		ValorNumerico expressao1 = i -> (i%5)==0;
		ValorNumerico2 expressao2 = (x, y) -> {
			int w = x + y;
			return w > 1000;
		};
		System.out.println(expressao2.teste(999, 2));
	}

}
