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

		while (true) {
			switch (opc) {
			case 1 -> {
				opc1(alumnos);
			}
			case 2 -> {
				System.out.println("Nombre del alumno: ");
				nombre = sc.next();
				System.out.println("Nota media del alumno: ");
				notaMedia = sc.nextInt();
				opc2(nombre, notaMedia, alumnos);
			}
			case 3 -> {
				System.out.println("Nombre del alumno: ");
				nombre = sc.next();
				System.out.println("Nueva nota media: ");
				notaMedia = sc.nextInt();
				opc3(nombre, notaMedia, alumnos);
			}case 4 -> {
				System.out.println("Nombre del alumno: ");
				nombre = sc.next();
				opc4(nombre, alumnos);
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
	public static void opc1(Alumno[] arrayAlumnos) {

		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i] != null) {
				System.out.println(arrayAlumnos[i]);
			}
		}
	}

	/**
	 * Crea nuevos alumnos en un array
	 * 
	 * @param nombreA      Nombre que tendrá el objeto Alumno
	 * @param notaMediaA   Nota media que tendrá el objeto aAlumno
	 * @param tablaAlumnos Array donde se meterán los objetos Alumno
	 */
	public static void opc2(String nombreA, double notaMediaA, Alumno[] tablaAlumnos) {

		for (int i = 0; i < tablaAlumnos.length; i++) {

			if (tablaAlumnos[i] == null) {
				tablaAlumnos[i] = new Alumno(nombreA, notaMediaA);
				break;
			}
		}

	}

	/**
	 * Modifica las notas de los alumnos
	 * 
	 * @param nombreA      Nombre del alumno al que se le va a modificar la nota
	 * @param nuevaNota    Nota media nueva que se le va a asignar al alumnos
	 * @param tablaAlumnos Array donde se guardan los alumnos
	 */
	public static void opc3(String nombreA, int nuevaNota, Alumno[] tablaAlumnos) {

		for (int i = 0; i < tablaAlumnos.length; i++) {

			if ( tablaAlumnos[i] != null && tablaAlumnos[i].getNombre().equals(nombreA) ) {
				tablaAlumnos[i].setNotaMedia(nuevaNota);
			}

		}

	}
	
	/**
	 * 
	 * @param nombreA
	 * @param tablaAlumnos
	 */
	public static void opc4(String nombreA, Alumno[] tablaAlumnos) {
		
		for (int i = 0; i < tablaAlumnos.length; i++) {
			
			if(tablaAlumnos[i] != null && tablaAlumnos[i].getNombre().equals(nombreA)) {
				tablaAlumnos[i] = null;
			}
			
		}
		
	}

}
