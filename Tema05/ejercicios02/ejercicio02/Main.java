package ejercicio02;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	private static final int MAX_ARTICULOS = 20;

	public static void main(String[] args) {
		//creación del objeto array listaProductos
		Gestesimal[] listaProductos = new Gestesimal[MAX_ARTICULOS];
		//opción de un menú
		int opc = 0;
		
		//muestra el menú y recoge la opción escogida de este
		menu();
		opc = sc.nextInt();
		
//		switch (opc) {
//	    case 1 ->listarArticulos();
//	    case 2 -> altaArticulo();
//	    case 3 -> bajaArticulo();
//	    case 4 -> modificarArticulo();
//	    case 5 -> entradaMercancia();
//	    case 6 -> salidaMercancia();
//	    case 7 -> System.out.println("FIN");
//	    default -> System.out.println("Opción no válida.");
		
		
	}
	
	//menú
	public static void menu() {
		
		System.out.println("Menú:\n ");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
		System.out.print("\nSeleccione una opción: ");
		
	}
	
	public static void listarArticulos(Gestesimal listaProductos[]) {
		
	}
}
