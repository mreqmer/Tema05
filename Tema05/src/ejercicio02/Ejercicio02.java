package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		Libro lb1 = new Libro("Mistborn", "Brandon Sanderson", 12, 2);
		
		System.out.println(lb1);
		
		Libro lb2;
		
		lb2 = new Libro("libro", "a", 1, 2 );
		
		System.out.println(lb2);
		
		
		lb2.setAutor("patata");
		System.out.println(lb2.getAutor());
		
	}

}
