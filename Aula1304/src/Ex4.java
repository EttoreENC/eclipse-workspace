import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int x, y, z;

		System.out.print("x = ");
		x = teclado.nextInt();

		System.out.print("y = ");
		y = teclado.nextInt();

		System.out.print("z = ");
		z = teclado.nextInt();

		if (x == y || x == z || y == z) {
			System.out.println("Há valores iguais");
		} else {
			if (x < y && x < z) {
				System.out.println("O menor valor é " + x);
			} else {
				if (y < x && y < z) {
					System.out.println("O menor valor é " + y);
				} else {
					System.out.println("O menor valor é " + z);
				}
			}
		}

	}
}
