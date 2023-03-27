import java.util.Scanner;

public class Teste1_v2 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.print("Digite a letra--> ");
		letra = teclado.next();
		
		// converte a string toda para minúsculo
		letra = letra.toLowerCase();
		
		switch (letra) {
		case"a":
		case"i":
		case"u":
		case"e":
		case"o":
			System.out.println("É uma vogal");
			break;
		default:
			System.out.println("Não é uma vogal");
		}
			
	}

}
