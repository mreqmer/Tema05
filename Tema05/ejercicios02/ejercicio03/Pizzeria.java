package ejercicio03;

import ejercicio03.Pizza.Estado;

public class Pizzeria {

	static Pizza[] pizzas = new Pizza[30];

	/**
	 * Muestra los objetos del array Pizza
	 */
	public static void listaPizzas() {

//		for (Pizza actual : pizzas) {
//			if (actual != null) {
//				System.out.println(actual);
//			}
//		}
		
		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] != null) {
				System.out.println(pizzas[i]);
			}
		}

	}

	/**
	 * Crea un nuevo pedido
	 * 
	 * @param codigo
	 * @param tamano
	 * @param tipo
	 * @return
	 */
	public static boolean nuevoPedido(int codigo, Pizza.Tamano tamano, Pizza.Tipo tipo) {
		Pizza pz = new Pizza(codigo, tamano, tipo);
		boolean anadido = false;
		int i = 0;

		while (i < pizzas.length && pizzas[i] != null) {
			i++;
		}

		if (i < pizzas.length) {
			pizzas[i] = pz;
			anadido = true;
		}

		return anadido;

	}

	/**
	 * Cambia el estado de la pizza a sevida
	 * 
	 * @param pizza
	 * @return
	 */
	public static boolean pizzaServida(int codigo) {
		boolean servida = false;
		int i = 0;

		while (i < pizzas.length && !servida) {

			if (pizzas[i].getCodigo() == codigo && pizzas[i].getEstado() == Estado.PEDIDA) {
				servida = true;
				pizzas[i].setEstado(Estado.SERVIDA);
			}
			i++;
		}

//		//recordar que no son malditas cadenas STRINGS, si quisiera que lo fueran debo hacer .toString()
//		if(pizza.getEstado() == Estado.PEDIDA) {
//			
//			servida = true;
//			
//			pizza.setEstado(Estado.SERVIDA);
//		}

		return servida;
	}
}
