import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("Primeiro valor = ");
		a = teclado.nextInt();
		
		System.out.print("Segundo valor = ");
		b = teclado.nextInt();
		
		System.out.print("Terceiro valor = ");
		c = teclado.nextInt();
		
		System.out.print("Quarto valor = ");
		d = teclado.nextInt();
		
		if(a > b && b > c && c > d) {
			System.out.println("Estão em ordem decrescente");
		}else if (a < b && b < c && c < d) {
			System.out.println("Estão em ordem crescente");
		}else {
			System.out.println("Não estão ordenados");
		}
		
		
		
	}

}
