import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		double s, i;
		
		System.out.print("O sal�rio � = ");
		s = teclado.nextDouble();
		
		if (s <= 2000) {
		    System.out.println("Isento");
		}else{
			if (s <= 3000) {
				i = (s - 2000) * 8/100;
		}else if (s <= 4500) {
				i = (s - 3000) * 18/100 + 80;
			}else {
				i = (s - 4500) * 28/100 + 350;
			}System.out.println("Imposto = " + i);
			
		}

	}

}
