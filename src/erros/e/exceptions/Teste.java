package erros.e.exceptions;

public class Teste {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		int i=0;
		String frases[] = {"um", "dois", "tres"};
		while (i<4) {
			try {
				System.out.println(frases[i]);
			
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro no acesso ao vetor");
			}
			i++;
		}
	}
}
