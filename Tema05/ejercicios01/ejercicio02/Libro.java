package ejercicio02;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares;
	private int prestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}

		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}

		if (prestados >= 0) {
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

	public String toString() {

		String cadena = "";

		cadena += this.titulo + " ";
		cadena += this.autor + " ";
		cadena += this.ejemplares + " ";
		cadena += this.prestados + " ";

		return cadena;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	
	
}
