import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double p, h, IMC;
		
		System.out.print("Peso em Kg--> ");
		p = teclado.nextDouble();
		
		System.out.print("Altura em metros--> ");
		h = teclado.nextDouble();
		
		IMC = p/(h * h);
		
		System.out.println("O IMC �: " + IMC);
		
		if (IMC < 25) {
			System.out.println("Esta com o peso normal");
		}else {
			System.out.println("Est� acima do peso");
		}
		
	}

}
