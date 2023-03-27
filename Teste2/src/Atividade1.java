import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double a, b, c, d, e, f, y;
		
		
		System.out.print("a-->");
		a = teclado.nextDouble();
		
		System.out.print("b-->");
		b = teclado.nextDouble();
		
		System.out.print("c-->");
		c = teclado.nextDouble();
		
		System.out.print("d-->");
		d = teclado.nextDouble();
		
		System.out.print("e-->");
		e = teclado.nextDouble();
		
		System.out.print("f-->");
		f = teclado.nextDouble();
		
		y = (a + b/c)/(d - e/f);
		
		System.out.println("y = " + y);
		
		
		
		
	}

}
