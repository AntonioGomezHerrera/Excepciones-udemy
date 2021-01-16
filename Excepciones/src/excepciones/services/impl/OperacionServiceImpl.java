/**
 * 
 */
package excepciones.services.impl;

import excepciones.services.OperacionService;

/**
 * @author Nokster Clase que implementa los metodos de la interface
 *         OperacionService para explicar el tema de excepciones
 */
public class OperacionServiceImpl implements OperacionService {

	
	@Override
	public double dividir(double numerador, double denominador) throws ArithmeticException {
		// TODO Auto-generated method stub
		return 0;
	}
//	@Override
//	public double dividir(double numerador, double denominador) throws ArithmeticException {
//		double resultado = numerador / denominador;
//		if (resultado != Double.POSITIVE_INFINITY) {
//			return resultado;
//		} else {
//			throw new ArithmeticException();
//		}
//	}

	/**
	 * Metodo sobrecargado de ejemplo para explicar las excepciones UNCHEKED
	 * @param numerador
	 * @param denominador
	 * @return
	 * @throws NullPointerException
	 */
	public double dividir(Double numerador, Double denominador) throws NullPointerException {
		double resultado = 0.0;
		
		if (denominador != null && numerador != null) {
			resultado = numerador / denominador;
		} else {
			throw new NullPointerException();
		}

		System.out.println(resultado);
		return resultado;
	}



}
