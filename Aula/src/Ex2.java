import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double x, y, z;
		
		System.out.print("Lado 1-->");
		x = teclado.nextDouble();
		
		System.out.print("Lado 2-->");
		y = teclado.nextDouble();
		
		System.out.print("Lado 3-->");
		z = teclado.nextDouble();
		
		if (z < x + y && x < y + z && y < x + z) {
			System.out.println("� um tri�ngulo");
		}else {
			System.out.println("N�o � um tri�ngulo");
		}

	}

}
