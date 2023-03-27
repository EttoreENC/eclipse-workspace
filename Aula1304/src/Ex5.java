import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x, y, z, aux;
		// ordem cresente

		System.out.print("Valor 1 = ");
		x = teclado.nextInt();

		System.out.print("Valor 2 = ");
		y = teclado.nextInt();

		System.out.print("Valor 3 = ");
		z = teclado.nextInt();

		if (x > y) {
			aux = x;
			x = y;
			y = aux;
		}
		if (x > z) {
			aux = x;
		    x = z;
		    z = aux;
		}
		if (y > z) {
			aux = y;
		    y = z;
			z = aux;
		}
		System.out.println(x + ", " + y + ", " + z);
	}

}
