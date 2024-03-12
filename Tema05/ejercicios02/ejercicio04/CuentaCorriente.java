package ejercicio04;

public class CuentaCorriente {
		private String dni = "";
		private String nombre = "";
		private double saldo;

		public CuentaCorriente(String dni, double saldo) {
			if (dni != null && !dni.equals("")) {
				this.dni = dni;
			}
			if (saldo >= 0) {
				this.saldo = saldo;
			}
		}

		public CuentaCorriente(String dni, String nombre, double saldo) {
			this(dni, saldo);
			if (nombre != null && !nombre.equals("")) {
				this.nombre = nombre;
			}
		}

		public String getDni() {
			return dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			if (nombre != null && !nombre.equals("")) {
				this.nombre = nombre;
			}
		}

		public double getSaldo() {
			return saldo;
		}

		
		public String toString() {
			String cadena = "";

			cadena += "------------------------------\n";
			cadena += "Titular: " + this.nombre + "\n";
			cadena += "DNI: " + this.dni + "\n";
			cadena += "Saldo: " + this.saldo + "\n";
			cadena += "------------------------------";

			return cadena;
		}

		
	}

