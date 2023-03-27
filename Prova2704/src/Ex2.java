import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("Valor a = ");
		a = teclado.nextInt();
		
		System.out.print("Valor b = ");
		b = teclado.nextInt();
		
		System.out.print("Valor c = ");
		c = teclado.nextInt();
		
		System.out.print("Valor d = ");
		d = teclado.nextInt();
		
		if( b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a%2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores não aceitos");
		}

	}

}
