package ejercicio02;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares;
	private int prestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (this.titulo != null) {
			this.titulo = titulo;
		}
		if (this.autor != null && !this.autor.equals("")) {
			this.autor = autor;
		}

		if (this.ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}

		if (this.prestados >= 0) {
			this.prestados = prestados;
		}

	}

	public boolean prestamo() {
		boolean prestamo = false;

		if (this.prestados <= this.ejemplares) {
			this.prestados++;
			prestamo = true;
		}

		return prestamo;
	}

	public boolean devolucion() {
		boolean devolucion = false;

		if (prestados > 0) {
			prestados--;
			devolucion = true;
		}

		return devolucion;
	}

}
