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
	
//	public boolean sacarDinero(double dinero) {
//		boolean transaccion = false;
//
//		if (this.saldo >= dinero) {
//			this.saldo -= dinero;
//			transaccion = true;
//		}
//
//		return transaccion;
//	}
//
//	public void ingresarDinero(double dinero) {
//		if (dinero > 0) {
//			this.saldo += dinero;
//		}
//	}
//
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
