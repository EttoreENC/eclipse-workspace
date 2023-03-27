import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double d = 0, m = 0, x = 0, y = 0, x2 = 0, y2 = 0;
		int p = 1, n;

	    System.out.print("Número de pontos = ");
	    n = teclado.nextInt();

	    while (n > 0) {
	     System.out.println("Ponto "+ p + " = ");

	     System.out.print("Valor de x = ");
	     x = teclado.nextDouble();

	     System.out.print("Valor de y = ");
	     y = teclado.nextDouble();

	     d= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

	     System.out.println("Distância = " + d);
	     System.out.println();

	        if (d > m) {
	        	d = m;
	        	x2 = x;
	        	y2 = y;
	        }
	        n--;
	        p++;
	    }
	    System.out.println("Ponto mais distante é: ("+ x2 + ", " + y2 + ") ");
	}

}
