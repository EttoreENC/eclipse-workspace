import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double Ax, Ay, Bx, By, dist1, dist2;
		
		System.out.print("Coordenadas x de A-->");
		Ax = teclado.nextDouble();
		
		System.out.print("Coordenadas y de A-->");
		Ay = teclado.nextDouble();
		
		System.out.print("Coordenadas x de B-->");
		Bx = teclado.nextDouble();
		
		System.out.print("Coordenadas y de B-->");
		By = teclado.nextDouble();
		
		dist1 = Math.sqrt(Math.pow((Ax - 0), 2) + Math.pow((Ay - 0), 2));
		
		dist2 = Math.sqrt(Math.pow((Bx - 0), 2) + Math.pow((By - 0), 2));
		
		if (dist1<dist2) {
			System.out.println("O mais próximo é o ponto A");
		}else {
			System.out.println("O mais próximo é o ponto B");
			
		}
		
		
		
		
		
	}

}
