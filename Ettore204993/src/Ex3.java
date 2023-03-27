import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double t, t2, f;

		   System.out.print("Temperatura inicial = ");
		   t = teclado.nextDouble();

		   System.out.print("Temperatura final = ");
		   t2 = teclado.nextDouble();

		    while (t <= t2) {
		        f = 9 * t/5 + 32;
		        System.out.println(String.format("%.4f", t) + " ---> " + String.format("%.4f", f));
		        t++;
		    }
	}

}
