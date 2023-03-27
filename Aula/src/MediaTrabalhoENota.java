import java.util.Scanner;

class MediaTrabalhoENota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =  new Scanner(System.in);
		double prova1, prova2, mediap, trabalho1, trabalho2, mediat, mediafinal;
		
		System.out.print("Nota prova 1-->");
		prova1 = teclado.nextDouble();
		
		System.out.print("Nota prova 2-->");
		prova2 = teclado.nextDouble();
		
		mediap = (prova1 + prova2)/2; 
		System.out.println("Média prova = " + mediap);
        
		
		System.out.print("Nota trabalho 1-->");
		trabalho1 = teclado.nextDouble();
		
		System.out.print("Nota trabalho 2-->");
		trabalho2 = teclado.nextDouble();
		
		mediat = (trabalho1 + trabalho2)/2;
		System.out.println("Media trabalho = " + mediat);
		
		mediafinal = 7*mediap/10 + 3*mediat/10;
		System.out.println("Média final = " + mediafinal);
		
		if (mediafinal >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}

	}

}
