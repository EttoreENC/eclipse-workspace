import java.util.Scanner;

public class Ex2_v2 {

	public static void main(String[] args) {

		// String = arquivo
		// x = teclado.next(); --> next pega apenas uma palavra, ex: Carlos Rafael, so
		// fica Carlos
		// x = teclado.nextLine(); --> pega a linha inteira

		Scanner teclado = new Scanner(System.in);
		String nome, genero;
		double h, p;
		// int no genero para esse ex, não necessariamente para tudo
		// operador == não funciona para String mesmo não dando erro, mas sempre dá
		// falso.
		// ao invés disso usar: if (s1.equals(s2));

		System.out.print("Qual o seu gênero: ");
		genero = teclado.next();

		if (!genero.equalsIgnoreCase("masculino") && !genero.equalsIgnoreCase("feminino")) {
			System.out.println("Gênero inválido para essa aplicação");
		} else {
			teclado.nextLine(); // retira o enter ("ln") que sobrou da aplicação anterior
			System.out.print("Nome = ");
			nome = teclado.nextLine();
			System.out.print("Altura em metros = ");
			h = teclado.nextDouble();
			if (genero.equalsIgnoreCase("feminino")) {
				p = 62.1 * h - 44.7;
			} else {
				p = 72.7 * h - 58;
			}
			System.out.println(nome + ", seu peso ideal é: " + p);
		}

	}
}