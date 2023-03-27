import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double R, a;
		
		System.out.print("Salário = ");
		R = teclado.nextDouble();
		
		if (R <= 10000) {
		    System.out.println("Isento");
		}else{
			if (R <= 25000) {
				a = R * 10.35/100;
		}else if (R<=50000) {
				a = R * 25.42/100;
			}else {
				a = R * 29.75/100;
			}System.out.println("Alíquota = " + a);
			
		}
	
	}

}
