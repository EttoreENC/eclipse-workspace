import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		double h, x, y;
		
		System.out.print("h-->");
		h = teclado.nextDouble();
		
		System.out.print("x-->");
		x = teclado.nextDouble();
		
		y = 2*h-Math.pow(45/(3*x)-4*h*(3-h), 2*h);
		
		System.out.println("y =" + y);
		
		
		
		
		
		
		
		
		
		

	}

}
