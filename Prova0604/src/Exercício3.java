import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double S, V;
		
		System.out.print("Insira o valor das vendas--> ");
		V = teclado.nextDouble();
		
		if (V > 25000) {
		    S = (18.85/100) * V;
		}else {
			S = (17.5/100) * V;
		}
		
		System.out.println("O salário total é " + S);

  }
}