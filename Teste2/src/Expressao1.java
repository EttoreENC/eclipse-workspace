import java.util.Scanner;

public class Expressao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		double x, y, z, w, q, u;
		
	
		System.out.print("x---> ");
		x = teclado.nextDouble();
		
		System.out.print("y---> ");
		y = teclado.nextDouble();
				
	    System.out.print("w---> ");
		w = teclado.nextDouble();
	    
		System.out.print("q---> ");
		q = teclado.nextDouble();
				
		System.out.print("u---> ");
		u = teclado.nextDouble();
		
		
		z = (x + y) / (u + w / q);
		
		System.out.println("z = " + z);
		
		
		
		
		
		
		
		
		
			

	}

}
