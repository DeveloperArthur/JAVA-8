/* Criar uma classe Calculadora que realiza a divis�o de dois n�meros.
Realize o tratamento de exce��o adequado, fazendo uso de throws e throw.*/
package exercicio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			int resultado = n1/n2; 
			System.out.println(resultado);
		}catch(Exception e) {
			//System.out.println(e);
			throw new ArithmeticException();
		}
	}
}
