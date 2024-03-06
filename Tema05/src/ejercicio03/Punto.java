package ejercicio03;

public class Punto {
	
	private int x;
	private int y;
	
	
	public Punto() {
	}
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplaza(int dx, int dy){
		this.x += dx;
		this.y += dy;
		
	}
	
	public double distancia(Punto p) {
		double distancia = 0;
		
		distancia = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2) ) ;
		
		return distancia;
	}
	
	public String toString() {
		String cadena = "";
		
		cadena += "(" + x + ", ";
		cadena += y + ")";
		
		return cadena;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	
	
	
	
	
	

}
