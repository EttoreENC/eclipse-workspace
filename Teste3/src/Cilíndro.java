import java.util.Scanner;

public class Cilíndro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		double qtdlata, A, r, h, total;
		
		System.out.print("altura--> ");
		h = teclado.nextDouble();
		
		System.out.print("raio--> ");
		r = teclado.nextDouble();
		
		A = 2*Math.PI*r*(h + r);
		
		qtdlata = A / 3 / 5;
		
		total = qtdlata * 220;
		
		System.out.println("valor aproximado = " + total);
		System.out.println("total = " + qtdlata);
		
		
		
		
		
	}

}
