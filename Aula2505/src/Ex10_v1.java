import java.util.Scanner;

public class Ex10_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int n;
		double y = 0;
		int sinal = 1;
		
		System.out.println("Informe um valor inteiro e positivo = ");
		n = teclado.nextInt();
		
		if(n <= 0) {
			System.out.println("O valor informado é inválido");
		}else {
			for(int cont = 1; cont <=n; cont++) {
				if(cont % 2 != 0) {
					y = y + 1.0 / cont * sinal;
					sinal = sinal * -1;
				}else {
					y = y -1.0/cont;
				}
			}
			System.out.println("y = " + y);
		}

	}

}
