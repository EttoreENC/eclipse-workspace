import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int n;
		double L1, L2, L3;
		
		System.out.println("Quantidade de triangul�s = ");
		n = teclado.nextInt();
		
		for(int cont = 1; cont <=n; cont++) {
			System.out.println("----- Tri�ngulo " + cont + "-----");
			System.out.println("Lado 1 = ");
			L1 = teclado.nextDouble();
			System.out.println("Lado 2 = ");
			L2 = teclado.nextDouble();
			System.out.println("Lado 3 = ");
			L3 = teclado.nextDouble();
			if(L1 < L2 + L3 && L2 < L1 + L3 && L3 < L1 + L2) {
				if(L1 == L2 && L2 == L3) {
					System.out.println("Tri�ngulo equil�tero");
				}else if(L1 == L2 || L1 == L3 || L2 == L3) {
					System.out.println("Tri�ngulo is�sceles");
				}else {
					System.out.println("Tri�ngulo escaleno");
				}
			}else {
				System.out.println("N�o � um tri�ngulo");
			}
			System.out.println();
		}

	}

}
