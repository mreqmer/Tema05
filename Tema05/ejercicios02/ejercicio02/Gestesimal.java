package ejercicio02;

public class Gestesimal {

	/**
	 * Código del producto
	 */
	private int codigo;
	
	/**
	 * Descripción del producto
	 */
	private String descripcion;
	
	/**
	 * Precio de compra del producto
	 */
	private double precioCompra;
	
	/**
	 * Precio de venta del producto
	 */
	private double precioVenta; 
	
	/**
	 * Stock del producto
	 */
	private int stock;

	/**
	 * Constructor sin parámetros
	 */
	public Gestesimal() {

	}

	/**
	 * Constructor con parámetros
	 * @param codigo Código del producto
	 * @param descripcion Descripción del producto
	 * @param precioCompra Precio de compra del producto
	 * @param precioVenta Precio de venta del producto
	 * @param stock Stock del producto
	 */
	public Gestesimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * Get codigo
	 * @return código del producto
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Set codigo
	 * @param codigo Código del producto
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Get descripción
	 * @return Descripción del producto
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * set descripción
	 * @param descripcion Descripción del producto 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * To String con los datos de los artículos
	 */
	@Override
	public String toString() {
		return "GESTISIMAL [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
	
	
	
	

}
