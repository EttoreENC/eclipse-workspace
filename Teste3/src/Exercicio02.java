import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		//declara��o de vari�veis
		Scanner teclado = new Scanner(System.in);
		
		double base, altura, �rea, per�metro;
		
		//entrada de dados
		System.out.println("base--> ");
		base = teclado.nextDouble();
		
		System.out.println("altura--> ");
		altura = teclado.nextDouble();
		
		//processsamento de dados
	    �rea = (base*altura);
	    per�metro = 2*(base+altura);
	    
	    //sa�da de dados
	    System.out.println("�rea = " + String.format("%.3f", �rea));
		System.out.println("per�metro = " + per�metro);
		
		//string format n�o precisa ser usado, mas pode ser usado por exemplo para dinheiro
		
	}

}
