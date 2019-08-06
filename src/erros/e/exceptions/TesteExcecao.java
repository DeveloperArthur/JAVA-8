package erros.e.exceptions;

public class TesteExcecao {
	public static void main(String[] args) throws ArithmeticException{
		/*throws declara que o método pode provocar exceções do tipo declarado (ou de qualquer subtipo)*/
		try {
			int i=50;
			i=i/0;
			System.out.println("O resultado "+i);
			Object c = null;
			System.out.println("O resultado "+c.toString());
		}catch(ArithmeticException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println("ERRO");
		}
	}
}
