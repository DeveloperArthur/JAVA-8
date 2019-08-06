package lambdas;

public class Main {
	public static void main(String[] args) {
		System.out.println("Inicio do curso java 8!!");
		//implementa��o da classe anonima runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudando a expressao lambda 1");
			}
		};
		
		//Estrutura de express�o lambda
		Runnable r2;
		r2 = () //Lista de argumentos 
			 -> //Seta
		 	 System.out.println("Estudando a expressao lambda 2"); //corpo
		
		r1.run();
		r2.run();
	}
}
