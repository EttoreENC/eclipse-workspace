import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String letra;
		
		System.out.print("Digite a letra--> ");
		letra = teclado.next();
		
		// converte a string toda para minúsculo
		letra = letra.toLowerCase();
		
		if (letra.equals("a") || letra.equals("i") || letra.equals("u") || letra.equals("e") || letra.equals("o")) {
			System.out.println("É uma vogal");
		}else {
			System.out.println("Não é uma vogal");
		}
	}
}
