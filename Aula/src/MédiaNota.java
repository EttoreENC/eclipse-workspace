import java.util.Scanner;

public class M�diaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("nota1--> ");
		nota1 = teclado.nextDouble();
		
		System.out.print("nota2--> ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		System.out.println("A m�dia � " + media);
		
		//if = teste, so ser� executado se for vedadeiro (true)
		//Em situa��es exclusivas, juntar os ifs, else
		if (media>=7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
