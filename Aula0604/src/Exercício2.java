import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double a, b, c, D, x1, x2;
		
		System.out.print("Valor de a = ");
		a = teclado.nextDouble();
		
		if ( a == 0) {
			System.out.println("N�o � uma equa��o de segundo grau");
		}else {
		
		System.out.print("Valor de b = ");
		b = teclado.nextDouble();
		
		System.out.print("Valor de c =");
		c = teclado.nextDouble();
		
		
		D = b*b - 4*a*c;
		
		//string format para "limitar" o n�mero mostrado
		if (D >=0) {
			x1 = (-b + Math.sqrt(D))/(2 * a);
			x2 = (-b - Math.sqrt(D))/(2 * a);
			System.out.println("Ra�z de x1 = " + String.format("%.2f", x1));
			System.out.println("Ra�z de x2 = " + x2);
		}else {
			System.out.println("N�o h� ra�z real");
		}
		}
	}

}
