package ejercicio04;

public class Banco {
	
	CuentaCorriente[] usuarios = new CuentaCorriente[50];
	
	public boolean nuevoUsuario(int dni, String nombre, double saldo) {
		boolean correcto = false;
		
		for(int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != null) {
				System.out.println(usuarios[i]);
			}
		}
		
		return correcto;
	}
	
	/**
	 * retira dinero de la cuenta
	 * @param usuarios
	 * @param sacarSaldo
	 * @return
	 */
	public boolean sacarDinero(CuentaCorriente usuarios, double sacarSaldo) {
		boolean transaccion = false;
		double saldoInicial = usuarios.getSaldo();
		double saldoFinal;
		
		saldoFinal = saldoInicial - sacarSaldo; 
		
		usuarios.setSaldo(saldoFinal);
		
		return transaccion;
	}
	
	
	/**
	 * ingresa dinero en la cuenta
	 * @param usuarios
	 * @param dineroIngresar
	 * @return
	 */
	public boolean ingresarDinero(CuentaCorriente usuarios, double dineroIngresar) {
		boolean ingresado = false;
		double saldoInicial = usuarios.getSaldo();
		double saldoFinal;
		
		saldoFinal = saldoInicial + dineroIngresar; 
		
		return ingresado;
	}
	

	public void mostrarInformacion() {
		
		
		
	}
//	public void mostrarInformacion() {
//		System.out.println("Titular: " + this.nombre);
//		System.out.println("DNI: " + this.dni);
//		System.out.println("Saldo: " + this.saldo);
//	}
//	
//	public boolean equals(CuentaCorriente c) {
//		boolean sonIguales = false;
//
//		if (this.dni.equals(c.dni)) {
//			sonIguales = true;
//		}
//
//		return sonIguales;
//	}
}
