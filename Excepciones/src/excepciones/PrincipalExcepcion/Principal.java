/**
 * 
 */
package excepciones.PrincipalExcepcion;

import excepciones.services.OperacionService;
import excepciones.services.impl.OperacionServiceImpl;

/**
 * @author Nokster Clase que permite mostrar las funcionalidades de las
 *         excepciones
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primerNumero = 5;
		int segundoNumero = 5;

		double resultado = 0.0;

		try {
			resultado = primerNumero / segundoNumero;
		} catch (ArithmeticException e) {
			// TODO: handle exceptio
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.err.println("Error ocasionado por una division entre 0");
		} finally {
			System.out.println("Entnado a finally");
		}

		System.out.println("El resultado es: " + resultado);
		
		// Capturando excepcion con try-catch lanzada con throws
		
		OperacionServiceImpl operacionServiceImpl = new OperacionServiceImpl();
		
		try {
			double resultadoDivision = operacionServiceImpl.dividir(10.0, 0.0);
			System.out.println("Resultado division: " + resultadoDivision);
		} catch (ArithmeticException e) {
			System.err.println("Hubo un problema en la division con metodo throws " + e.getMessage());
		}
	}

}
