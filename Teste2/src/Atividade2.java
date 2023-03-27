import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print("x-->");
		x = teclado.nextDouble();
		
		y = ((2*x*x - 3*Math.pow(x, x + 1))/2 + Math.sqrt(x + 1)/x)/(Math.pow(2, x));
		
		System.out.println("y = " + y);
				
		

	}

}
