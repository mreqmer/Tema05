package ejercicio04;

public class Banco {
	
	static CuentaCorriente[] usuarios = new CuentaCorriente[50];
	
	public static void mostrarInfo(CuentaCorriente cuenta) {
		
		System.out.println(cuenta);
		
	}
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 * @return
	 */
	public static boolean nuevoUsuario(CuentaCorriente cuenta) {
		boolean correcto = false;
		int i = 0;
		
		while(i<usuarios.length && usuarios[i]!=null) {
			i++;
		}
		
		if(i<usuarios.length) {
			usuarios[i] = cuenta;
			correcto = true;
		}
		
		return correcto;
	}
	
	/**
	 * 
	 * @param dni
	 * @return
	 */
	public static int buscaUsuario(String dni) {
		int i=0;
		int existe = -1;
		
		while(i<usuarios.length && existe == -1){
			if(usuarios[i]!=null &&  usuarios[i].getDni().equals(dni) ) {
				existe = i;
			}
			i++;
		}
		return existe;
	}

	/**
	 * retira dinero de la cuenta
	 * @param usuarios
	 * @param sacarSaldo
	 * @return
	 */
	public static boolean sacarDinero(CuentaCorriente usuarios, double sacarSaldo) {
		boolean transaccion = false;
		double saldoInicial = usuarios.getSaldo();
		double saldoFinal = saldoInicial;
		
		if(sacarSaldo <= saldoInicial) {
			saldoFinal -= sacarSaldo;
			usuarios.setSaldo(saldoFinal);
			transaccion = true;
		}
		
		return transaccion;
	}
	
	
	/**
	 * ingresa dinero en la cuenta
	 * @param usuarios
	 * @param dineroIngresar
	 * @return
	 */
	public static boolean ingresarDinero(CuentaCorriente usuarios, double dineroIngresar) {
		boolean ingresado = false;
		double saldoInicial = usuarios.getSaldo();
		double saldoFinal = saldoInicial;
		
		if(dineroIngresar > 0) {
			saldoFinal += dineroIngresar;
			usuarios.setSaldo(saldoFinal);
			ingresado = true;
		}

		return ingresado;
	}
	

}
