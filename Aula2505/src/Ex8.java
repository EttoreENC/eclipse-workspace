import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int v, cont, t = 0;
		
		System.out.println("Valor inteiro e positivo = ");
		v = teclado.nextInt();
		
		if(v <= 0) {
			System.out.println("Valor inv�lido");
		}else {
			for(cont = 1; cont <= v; cont++) {
				if(v % cont == 0) {
					t++;
					break;
				}
			}
			if(t == 0) {
				System.out.println("O valor informado � primo");
			}else {
				System.out.println("O valor informado n�o � primo");
			}
		}

	}

}
