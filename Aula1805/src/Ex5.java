import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int x = 1;
		
		while (x <= 3) {
			y = y + 1.0/x;
			x++;
		}
		System.out.println("y = " + y);
		

	}

}
