import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int n, cont, r, resposta;
		// cont = contador;
		
		do {
			System.out.print("Número = ");
			n = teclado.nextInt();
		
			cont = 0;
		
			while (cont <=10) {
				r = n * cont;
				System.out.println(n + " * " + cont + " = " + r);
				cont = cont + 1;
			}
			System.out.println("\nDigite 1 para nova tabuada ou 0 para finalizar: ");
			resposta = teclado.nextInt();
			
		}while (resposta == 1);

	}

}
