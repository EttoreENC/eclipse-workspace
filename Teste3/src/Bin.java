import java.util.Scanner;

public class Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int nb, x, y, z, w, R;
		
		System.out.print("Valor binário de 4 dígitos--> ");
		nb = teclado.nextInt();
		
		
		x = nb/1000;
		y = nb % 1000 / 100;
		z = nb % 100 / 10;
		w = nb % 10;
		
		R = 8*x + 4*y + 2*z + w*1;
		
		System.out.println("Resultado = " + R);
		
		
		

	}

}
