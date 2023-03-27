import java.util.Scanner;

public class MédiaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("nota1--> ");
		nota1 = teclado.nextDouble();
		
		System.out.print("nota2--> ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		System.out.println("A média é " + media);
		
		//if = teste, so será executado se for vedadeiro (true)
		//Em situações exclusivas, juntar os ifs, else
		if (media>=7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
