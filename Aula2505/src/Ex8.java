import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int v, cont, t = 0;
		
		System.out.println("Valor inteiro e positivo = ");
		v = teclado.nextInt();
		
		if(v <= 0) {
			System.out.println("Valor inválido");
		}else {
			for(cont = 1; cont <= v; cont++) {
				if(v % cont == 0) {
					t++;
					break;
				}
			}
			if(t == 0) {
				System.out.println("O valor informado é primo");
			}else {
				System.out.println("O valor informado não é primo");
			}
		}

	}

}
