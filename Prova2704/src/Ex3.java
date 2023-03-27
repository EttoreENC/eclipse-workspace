import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		double x, y;

	    Scanner teclado = new Scanner(System.in);
	    System.out.print("insira o valor de X " );
	    x = teclado.nextDouble();

	    System.out.print("insira o valor de Y " );
	    y = teclado.nextDouble();



	    if (x > 0 && y > 0) {
	        System.out.println("Esta no quadrante 1");
	    } else if ( x > 0 && y < 0) {
	        System.out.println("Esta no quadrante 4");
	    } else if ( x < 0 && y < 0) {
	        System.out.println("Esta no quadrante 3");
	    } else if ( x < 0 && y > 0) {
	        System.out.println("Esta no quadrante 2");
	    } else if ( x == 0 && y != 0) {
	        System.out.println("Esta no eixo Y");
	    } else if ( x != 0 && y == 0) {
	        System.out.println("Esta no eixo X");
	    } else {
	        System.out.println("Esta na origem");
	    }

	}

}
