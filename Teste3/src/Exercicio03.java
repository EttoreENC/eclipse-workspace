import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, D, x1, x2;
		
		System.out.println("a--> ");
		a = teclado.nextDouble();
		
		System.out.println("b--> ");
		b = teclado.nextDouble();
		
		System.out.println("c--> ");
		c = teclado.nextDouble();
	
		D = b*b - 4*a*c;
		
		x1 = (-b + Math.sqrt(D))/(2*a);
		x2 = (-b - Math.sqrt(D))/(2*a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		
		
		
		
		
		
		
		
		

	}

}
