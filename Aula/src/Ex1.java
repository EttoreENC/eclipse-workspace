import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.println("Valor de x-->");
		x = teclado.nextDouble();
		
		//operadores lógicos: E = &&, OU = || (pipe), NÃO = !
		// == para igualdade
		if (x > 5 || x < -5) {
			y = (x - 8)/Math.sqrt(x*x - 25);
			System.out.println("Resultado = " + y);
		}else {
			System.out.println("Resultado inválido");
		}
		
		
		
	}

}
