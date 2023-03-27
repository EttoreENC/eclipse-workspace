import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int valor, contador = 1, maior = 0;
		
		while (contador <= 5) {
			System.out.print("Valor: ");
			valor = teclado.nextInt();
			if(valor > maior || contador == 1) {
				maior = valor;
			}
			contador = contador + 1;
		}
		System.out.println("Maior = " + maior);
	}

}
