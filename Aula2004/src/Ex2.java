import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x1, x2;
		
		System.out.println("Valor primário = ");
		x1 = teclado.nextInt();
		
		System.out.println("Valor secundário = ");
		x2 = teclado.nextInt();
		
		if (x1 < x2) {
			while(x1 <= x2) {
				System.out.println(x1);
				x1 = x1 + 1;
			}
		}else {
			System.out.println("Valor secundário maior que o primário");
		}
		
	}

}
