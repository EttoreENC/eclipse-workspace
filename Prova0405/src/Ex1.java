import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double m, i, c, t;
		
		System.out.print("Valor do capital = ");
		c = teclado.nextDouble();
		
		System.out.print("Valor da taxa de juros em porcentagem = ");
		i = teclado.nextDouble();
		
		System.out.print("Tempo em meses = ");
		t = teclado.nextDouble();
		
		m = c * Math.pow(1 + i/100, t);
				
		System.out.println("Montante final é: " + m);
		
	}

}
