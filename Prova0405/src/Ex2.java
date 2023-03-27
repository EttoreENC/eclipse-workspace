import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		int a, b, c, n, t;
		
		System.out.print("Alunos que votaram em A = ");
		a = teclado.nextInt();
		
		System.out.print("Alunos que votaram em B = ");
		b = teclado.nextInt();
		
		System.out.print("Alunos que votaram em C = ");
		c = teclado.nextInt();
		
		System.out.print("Alunos que votaram branco = ");
		n = teclado.nextInt();
		
		t = a + b + c + n;
		
		System.out.println("Total de votos = " + t);
		
		if (b > a && b > c) {
			System.out.println("B venceu");	
		}else if (a > b && a > c) {
			System.out.println("A venceu");
		}else {
			System.out.println("C venceu");
		}
		
		if (b < a && b < c) {
			System.out.println("B ficou em último");
		}else if (a < b && a < c) {
			System.out.println("A ficou em último");
		}else {
			System.out.println("C ficou em último");
		}
		
	}

}
