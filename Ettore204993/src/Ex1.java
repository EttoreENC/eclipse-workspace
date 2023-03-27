import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		  Scanner teclado = new Scanner(System.in);

		  double p, t, j;
		  int d;
		  
		  System.out.print("Valor principal (-1 para sair) = ");
		  p = teclado.nextDouble();
		  
		  while (p!= -1) {
		  System.out.print("Taxa de juros (-1 para sair) = ");
		  t = teclado.nextDouble();

		  System.out.print("Empréstimo em dias (-1 para sair) = ");
		  d = teclado.nextInt();
		  
		  j = p * t * d / 365;

		 System.out.println("Juros = R$" + j);

		 System.out.print("Valor principal (-1 para sair) = ");
		 p = teclado.nextDouble();
		  }

	}

}
