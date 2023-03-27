import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	    String p1, p2, p3;

	    System.out.println("Insira vertebrado ou invertebrado ");
	    p1 = teclado.next();
	    p1 = p1.toLowerCase();

	    System.out.println("Insira a classe a que o animal pertence ");
	    p2 = teclado.next();
	    p2 = p2.toLowerCase();

	    System.out.println("Insira a dieta do animal ");
	    p3 = teclado.next();
	    p3 = p3.toLowerCase();

	      if (p1.equals("vertebrado") && p2.equals("ave") && p3.equals("carnivoro") ) {
	          System.out.println("aguia");
	      } 
	      else if (p1.equals("vertebrado") && p2.equals("ave") && p3.equals("onivoro") ) {
	          System.out.println("pombo");
	      }
	      else if (p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("onivoro") ) {
	          System.out.println("homem");
	      } 
	      else if (p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("herbivoro") ) {
	          System.out.println("vaca");
	      }
	      else if (p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("hematofago") ) {
	          System.out.println("pulga");
	      }
	      else if (p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("herbivoro") ) {
	          System.out.println("lagarta");
	      }
	      else if (p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("hematofago") ) {
	          System.out.println("sanguessuga");
	      }
	      else if (p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("onivoro") ) {
	          System.out.println("minhoca");
	      } else {
	          System.out.println("Uma ou mais classificações colocadas estão erradas");
	      }

	}

}
