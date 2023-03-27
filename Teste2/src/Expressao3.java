import java.util.Scanner;

public class Expressao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x;
		
		
		System.out.print("a-->");
		a = teclado.nextDouble();
		
		System.out.print("b-->");
		b = teclado.nextDouble();
		
		System.out.print("c-->");
		c = teclado.nextDouble();
		
		x = (-b + Math.pow((Math.pow(b, 2) - 4*a*c), 1.0/2))/(2*a);
		
		System.out.println("x =" + x);
		
		
		
		
	}

}
