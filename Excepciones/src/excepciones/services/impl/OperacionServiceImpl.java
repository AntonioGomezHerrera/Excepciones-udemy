/**
 * 
 */
package excepciones.services.impl;

import excepciones.services.OperacionService;

/**
 * @author Nokster
 *Clase que implementa los metodos de la interface OperacionService para explicar
 *el tema de excepciones
 */
public class OperacionServiceImpl implements OperacionService{

	@Override
	public double dividir(double numerador, double denominador) throws ArithmeticException {
		double resultado = numerador / denominador;
		if (resultado != Double.POSITIVE_INFINITY) {
			return resultado;
		} else {
			throw new ArithmeticException();
		}
	}

	
}
