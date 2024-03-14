package ejercicio04;

import java.util.Scanner;

public class Main04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CuentaCorriente cuenta;

		int opc;

		int numCuenta;
		boolean salida;
		String dni;
		String nombre;
		double dineroTransaccion;
		String cuentaNueva;

		System.out.println("BIENVENIDO/A AL BANCO SANTANDER");
		System.out.println("INTRODUZCA SU DNI");
		dni = sc.nextLine();

		do {

			do {
				if (Banco.buscaUsuario(dni)==-1) {

					System.out.println("DNI no existente.");
					System.out.println("¿Quiere crear una cuenta?");

					cuentaNueva = sc.nextLine();

					if (cuentaNueva.equalsIgnoreCase("S")) {

						CuentaCorriente usuario = recogeDatos();
						dni = usuario.getDni();
					}
				}

				numCuenta = Banco.buscaUsuario(dni);

				nombre = Banco.usuarios[numCuenta].getNombre();

				System.out.println();
				System.out.println("Bienvenido " + nombre);
				System.out.println();

				menu();
				opc = sc.nextInt();
				sc.nextLine();

				switch (opc) {
				case 1 -> {

					System.out.println(Banco.usuarios[numCuenta]);
					System.out.println();

				}
				case 2 -> {
					System.out.println("dinero a ingresar:");
					dineroTransaccion = sc.nextDouble();
					sc.nextLine();

					if (Banco.ingresarDinero(Banco.usuarios[numCuenta], dineroTransaccion)) {
						System.out.println("Transacción hecha correctamente.");
					} else {
						System.out.println("Error");
					}

				}
				case 3 -> {
					System.out.println("Dinero a retirar:");
					dineroTransaccion = sc.nextDouble();
					sc.nextLine();

					if (Banco.sacarDinero(Banco.usuarios[numCuenta], dineroTransaccion)) {
						System.out.println("Transacción hecha correctamente.");
					} else {
						System.out.println("Error");
					}
				}
				case 4 -> {
					System.out.println("SALIENDO...");
					System.out.println();

				}
				case 5 -> {

					System.out.println("Apagando la terminal...");

				}
				default -> {

					System.out.println();
				}
				}
			} while (opc != 4);

			System.out.println("BIENVENIDO/A AL BANCO SANTANDER");
			System.out.println("INTRODUZCA SU DNI");
			dni = sc.nextLine();

		} while (opc != 5);

		System.out.println("Terminal apagada.");

	}

	static void menu() {

		System.out.println("¿Qué quiere hacer?");
		System.out.println();
		System.out.println("1.Mostrar información");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Sacar dinero");
		System.out.println();

	}

	static CuentaCorriente recogeDatos() {
		String dni;
		String nombre;
		double saldo;
		CuentaCorriente cuenta;

		System.out.println("dni");
		dni = sc.nextLine();
		System.out.println("nombre");
		nombre = sc.nextLine();
		System.out.println("Saldo");
		saldo = sc.nextInt();

		cuenta = new CuentaCorriente(dni, nombre, saldo);

		Banco.nuevoUsuario(cuenta);

		return cuenta;

	}

}
