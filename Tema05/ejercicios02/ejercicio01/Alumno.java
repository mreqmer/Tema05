package ejercicio01;

public class Alumno {

	/**
	 * Nombre del Alumno
	 */
	private String nombre;
	/**
	 * Nota media del Alumno
	 */
	private double notaMedia;
	
	/**
	 * Constructor sin parámetros
	 */
	public Alumno() {
	
	}
	
	/**
	 * Constructor con parámetros
	 * @param nombre Nombre del alumno 
	 * @param notaMedia Nota Media del alumno 
	 */
	public Alumno(String nombre, double notaMedia) {
		// El nombre no puede estar vacío
		if(nombre == null || !nombre.equals("")) {
			this.nombre = nombre;
		}
		//La nota no puede ser negativa
		if(notaMedia>=0) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Obtiene el nombre
	 * @return Nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * @param nombre Nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene la nota media
	 * @return nota media
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Modifica la nota media
	 * @param notaMedia Nota media
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	/**
	 * cadena de datos
	 */
	public String toString() {
		String cadena = "";
		
		cadena += this.nombre + ": " + this.notaMedia;
		
		return cadena;
	}
	
	
	
	

}
