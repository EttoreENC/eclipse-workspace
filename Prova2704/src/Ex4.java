import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n, a, b, c, d;
		
		System.out.print("O n�mero � = ");
		n = teclado.nextInt();
		
		a = n/1000;
		b = n/100 - a * 10;
		c = n/10 - (a * 100 + b * 10);
		d = n%10;
		
		
		if (a == d && b==c) {
			System.out.println("� pal�ndromo");
		}else {
			System.out.println("N�o � pal�ndromo");
		}

	}

}
