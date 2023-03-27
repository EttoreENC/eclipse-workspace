import java.util.Scanner;

public class seiLÁ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		int x, y;
		
		System.out.print("Valor entre 0 e 60--> ");
		x = teclado.nextInt();
		
		y = (x + 1)%61;
		
		System.out.println("Resultado = " + y);
		
		
		
		
		
		
		
	}

}
