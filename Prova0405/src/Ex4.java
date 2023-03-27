import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int d, m, a, de, me, ae;
		String nome;
		
		System.out.print("Digite o nome: ");
		nome = teclado.next();
		
		System.out.print("Digite o dia do nascimento: ");
		d = teclado.nextInt();
		
		System.out.print("Digite o mês do nascimento: ");
		m = teclado.nextInt();
		
		System.out.print("Digite o ano do nascimento: ");
		a = teclado.nextInt();
		
		System.out.print("Dia de ingresso na empresa: ");
		de = teclado.nextInt();
		
		System.out.print("Mês de ingresso na empresa: ");
		me = teclado.nextInt();
		
		System.out.print("Ano de ingresso na empresa: ");
		ae = teclado.nextInt();
		
		if (2022 - a >= 65 || 2022 - ae >= 30 || (2022 - a >= 60 && 2022 - ae >= 25)) {
			System.out.println("Requerer aposentadoria");
		}else {
			System.out.println("Não requerer");
		}
		
		
		
	}

}
