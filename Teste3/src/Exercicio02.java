import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		//declaração de variáveis
		Scanner teclado = new Scanner(System.in);
		
		double base, altura, área, perímetro;
		
		//entrada de dados
		System.out.println("base--> ");
		base = teclado.nextDouble();
		
		System.out.println("altura--> ");
		altura = teclado.nextDouble();
		
		//processsamento de dados
	    área = (base*altura);
	    perímetro = 2*(base+altura);
	    
	    //saída de dados
	    System.out.println("área = " + String.format("%.3f", área));
		System.out.println("perímetro = " + perímetro);
		
		//string format não precisa ser usado, mas pode ser usado por exemplo para dinheiro
		
	}

}
