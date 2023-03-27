import java.util.Scanner;

public class ExExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		double a, p, y;
		int n;
		
		System.out.println("Total de pacientes = ");
		n = teclado.nextInt();
		
		for(int cont = 1; cont <=n; cont++) {
			teclado.nextLine();
			System.out.println("Nome do paciente: ");
			nome = teclado.nextLine();
			System.out.println("Peso em Kg = ");
			p = teclado.nextDouble();
			System.out.println("Altura em metros = ");
			a = teclado.nextDouble();
			
			y = p/(a * a);
			
			System.out.println(nome + " seu imc é: " + y);
			
			System.out.println();
		}	
		
	}

}
