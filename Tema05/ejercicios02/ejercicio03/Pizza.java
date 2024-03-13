package ejercicio03;

public class Pizza {
	
	/**
	 * Valores para los tamaños de las pizzas
	 */
	enum Tamano {
		MEDIANA, FAMILIAR
	}
	
	/**
	 * Valores para los tipos de sabores de las pizzas
	 */
	enum Tipo{
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}
	
	/**
	 * Estado que puede tener la pizza
	 */
	enum Estado{
		PEDIDA, SERVIDA
	}

	
	/**
	 *  valor numérico diferente para cada pizza.
	 */
	private int codigo;
	
	/**
	 * tamaño de la pizza
	 */
	private Tamano tamano;

	/**
	 * sabor de la pizza
	 */
	private Tipo tipo;
	
	/**
	 * 
	 */
	private Estado estado;
	//también puedo dejarso así para inicializarlo
	//private Estado estado = Estado.PEDIDA;
	

	/**
	 * Constructor por defecto para asignar al estado PEDIDA
	 */
	public Pizza() {
		this.estado = Estado.PEDIDA;
	}
	

	/**
	 * Constructor con parámetros para el objeto Pizza
	 * @param codigo Codigo de la pizza
	 * @param tamano Tamaño que tendrá la pizz
	 * @param tipo Tipo de la pizza
	 */
	public Pizza(int codigo, Tamano tamano, Tipo tipo) {
		this();
		if(codigo >= 0) {
			this.codigo = codigo;
		}
		
		this.tamano = tamano;
		
		this.tipo = tipo;
	}


	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return
	 */
	public Tamano getTamano() {
		return tamano;
	}

	/**
	 * 
	 * @param tamano
	 */
	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}

	/**
	 * 
	 * @return
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @return
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		cadena += "Codigo: " + this.codigo +", ";
		cadena += "Tamaño: " + this.tamano + ", ";
		cadena += "Tipo: " + this.tipo + ", ";
		cadena += "Estado: " + this.estado;
		
		return cadena;
	}
	
	
	
	
	
	
}
