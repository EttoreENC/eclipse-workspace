import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// declara��o de vari�veis
		Scanner teclado = new Scanner(System.in);
		double x, y, w, z;
		
		//entrada de dados
		System.out.print("x--> ");
		x = teclado.nextDouble();
		
		
		System.out.print("y--> ");
		y = teclado.nextDouble();
		
		
		System.out.print("w--> ");
		w = teclado.nextDouble();
		
		//processamento de dados
		z = (x + y + w)/3;
		
		//sa�da de dados
		System.out.println("z = " + z);	

	}

}
