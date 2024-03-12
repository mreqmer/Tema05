package ejercicio03;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		int codigo = 0;
		String tamano;
		String tipo;
		boolean valido;

		menu();
		opc = sc.nextInt();
		sc.nextLine();

		while (opc != 4) {
			
			switch (opc) {
			case 1 -> {
				Pizzeria.listaPizzas();
			}
			case 2 -> {
				System.out.println("Codigo del pedido: ");
				codigo = sc.nextInt();
				
				sc.nextLine();
				System.out.println("Tamaño de la pizza: ");
				tamano = sc.nextLine();
				tamano = tamano.toUpperCase();
				System.out.println("Tipo de la pizza: ");
				tipo = sc.nextLine();
				tipo = tipo.toUpperCase();
				
				valido = Pizzeria.nuevoPedido(codigo, Pizza.Tamano.valueOf(tamano), Pizza.Tipo.valueOf(tipo));
				if (valido) {
					System.out.println("Añadido correctamente");
				} else {
					System.out.println("pedidos máximos");
				}
				
			}
			case 3 -> {
				System.out.println("Codigo para cambiar el estado de la pizza: ");
				codigo = sc.nextInt();
				Pizzeria.pizzaServida(codigo);
			}
			default -> {
				System.out.println("Opción incorrecta.");
			}
			}
			

			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			
		}

		System.out.println("Fin del programa");

	}

	static void menu() {
		System.out.println("1. Listado pizzas.");
		System.out.println("2. Nuevo pedido.");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
		System.out.println("\nElija una opción: ");
	}

}
