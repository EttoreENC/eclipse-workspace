import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int d;
		double y;
		
		System.out.print("Número de diárias--> ");
		d = teclado.nextInt();
		
		if (d > 15) {
			y = (150 + 15.5) * d;
		}else if (d == 15) {
			y = (150 + 36) * d;
		}else {
			y = (150 + 58) * d;
		}
		System.out.println("Total = " + y);	
		
	}

}
