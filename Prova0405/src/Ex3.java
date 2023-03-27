import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double t, f, c, i;
		
		System.out.print("Custo de fábrica = ");
		f = teclado.nextDouble();
		
		if (f <= 12000) {
			c = 5.0/100 * f;
			i = 0;
		}else if (f <= 25000) {
			c = 10.0/100 * f;
			i = 15.0/100 * f;
		}else{
			c = 15.0/100 * f;
			i = 20.0/100 * f;
		}
		
		t = f + c + i;
		
		System.out.print("Valor total = " + t);
		
		
	}

}
