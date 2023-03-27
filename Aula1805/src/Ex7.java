import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.println("Valor do número = ");
		x = teclado.nextInt();
		
		if (x < 0) {
			System.out.println("O valor deve ser inteiro e positivo");
		}else {
			for (int cont = 1; cont <= 10; cont++) {
				if(x % cont == 0) {
					System.out.println(cont + " ");
				}
			}
		}
		

	}

}
