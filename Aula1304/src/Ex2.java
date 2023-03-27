import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// String = arquivo
		// x = teclado.next(); --> next pega apenas uma palavra, ex: Carlos Rafael, so fica Carlos
		// x = teclado.nextLine(); --> pega a linha inteira
		
		Scanner teclado = new Scanner(System.in);
	    String nome;	    
	    double h, p;
	    int genero;
	    // int no genero para esse ex, n�o necessariamente para tudo
	    // operador == n�o funciona para String mesmo n�o dando erro, mas sempre d� falso.
	    // ao inv�s disso usar: if (s1.equals(s2));
	    
	    System.out.print("Nome = ");
	    nome = teclado.nextLine();
	   
	    System.out.print("Altura em metros = ");
	    h = teclado.nextDouble();
	    
	    System.out.print("Digite 1 para masculino ou 2 para feminino--> ");
	    genero = teclado.nextInt();
	    
	    if (genero < 1 || genero > 2) {
	    	System.out.println("G�nero inv�lido");
	    }else {
	    	if (genero == 1) {
	    		p = 72.7 * h - 58;
	    	}else {
	    		p = 62.1 * h - 44.7; 
	    	}
	    	System.out.println(nome + ", seu peso ideal �: " + p);
	    }
    
	}

}
