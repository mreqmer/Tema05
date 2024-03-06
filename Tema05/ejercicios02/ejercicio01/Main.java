package ejercicio01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Array con la información de la clase Alumnos
		Alumno alumnos[] = new Alumno[30];
		// nombre que se le pondrá al objeto alumno
		String nombre;
		// notaMedia que se le pone al objeto Alumno
		int notaMedia;
		// opción que se recoge de un menú
		int opc = 0;

		// se muestra el menú y se recoge la opción introducida
		menu();
		System.out.println("Introduce la opción del menú: ");
		opc = sc.nextInt();

		while(true) {
			switch (opc) {
			case 1 -> {
				opc1(alumnos);
			}
			case 2 -> {
				System.out.println("Nombre del alumno: ");
				nombre = sc.next();
				System.out.println("Nota Media del aLumno: ");
				notaMedia = sc.nextInt();
				opc2(nombre, notaMedia, alumnos);
			}

			}
			menu();
			System.out.println("Introduce la opción del menú: ");
			opc = sc.nextInt();
		}

	}

	/**
	 * Menu a mostrar
	 */
	static public void menu() {

		String menu = "";

		menu += "ALUMNOS/AS \n\n";
		menu += "=================== \n\n";
		menu += "1. Listado.\n";
		menu += "2. Nuevo Alumno.\n";
		menu += "3. Modificar.\n";
		menu += "4. Borrar.\n";
		menu += "5. Salir.\n";

		System.out.println(menu);
	}

	/**
	 * Muestra los alumnos con sus notas
	 * 
	 * @param arrayAlumnos Tabla con los objetos Alumno
	 */
	static public void opc1(Alumno[] arrayAlumnos) {

		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i] != null) {
				System.out.println(arrayAlumnos[i]);
			}
		}
	}

	static public void opc2(String nombreA, double notaMediaA, Alumno[] tablaAlumnos) {

		for (int i = 0; i < tablaAlumnos.length; i++) {
			if (tablaAlumnos[i] == null) {
				tablaAlumnos[i] = new Alumno(nombreA, notaMediaA);
				break;
			}
		}

	}

}
