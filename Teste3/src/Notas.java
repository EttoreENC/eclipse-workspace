import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z, w, nb, R, a, b, c;
		
		System.out.print("Coloque o valor--> ");
		nb = teclado.nextInt();
		
		x = nb/100;
		y = nb % 100 / 50;
		z = nb % 100 % 50 /20;
		w = nb % 100 % 50 % 20 / 10;
		a = nb % 100 % 50 % 20 % 10 / 5;
		b = nb % 100 % 50 % 20 % 10 % 5 / 2;
		c = nb % 100 % 50 % 20 % 10 % 5 % 2 / 1;
		
		R = x + y + z + w + a + b + c;
		
		System.out.println("Resultado--> " + R);

	}

}
