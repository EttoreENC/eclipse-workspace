import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double SB, HA, DSR, VAula, total;
		int a;
		
		System.out.print("Quantidade de aulas semanais--> ");
		a = teclado.nextInt();
		
		System.out.print("Valor da aula do professor--> ");
		VAula = teclado.nextDouble();
		
		SB = a * 4.5 * VAula;
		HA = 0.05 * SB;
		DSR = (SB + HA)/6;
		
		total = SB + HA + DSR;
		
		System.out.println("Salário final = " + total);
	}

}
