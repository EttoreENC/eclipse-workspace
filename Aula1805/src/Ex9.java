import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double t = 0, p;
		int q, forma;
		
		System.out.println("Quantidade de itens = ");
		q = teclado.nextInt();
		
		for (int cont = 1; cont <= q; cont++) {
			System.out.println("Preço do produto " + cont + " R$ " );
			p = teclado.nextDouble();
			t = t + p;
		}
		System.out.println("Total da compra = R$" + String.format("%.2f", t));
		
		System.out.println("\nDigite 1 para pagamento à vista ou 2 para parcelado");
		forma = teclado.nextInt();
		
		if(forma == 1) {
			t = t *0.9;
			System.out.println("Total para pagamento à vista R$" + String.format("%.2f", t));
		}else {
			t = t * 1.155;
			System.out.println("Total para pagamento em duas vezes R$" + String.format("%.2f", t));
		}
	}
}
