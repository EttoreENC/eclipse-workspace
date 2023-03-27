import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int cont, valor, fatorial;
		
		// entrada de dados;
		
		
		do {
		System.out.print("Variável = ");
		valor = teclado.nextInt();
		if(valor < 0) {
			System.out.println("O valor deve ser inteiro e positivo");
		}
		}while (valor < 0);
			// cálculo e impressão do fatorial
		cont = 1;
		fatorial = 1;
		while(cont <= valor) {
			fatorial = fatorial * cont;
			cont++; // contador = contador + 1;
		}
		System.out.println(valor + "! = " + fatorial);
		}
	}

