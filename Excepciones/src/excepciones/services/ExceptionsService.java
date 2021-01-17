/**
 * 
 */
package excepciones.services;

import cutomsexceptions.MyException;

/**
 * @author Nokster Interface que permite proporcionar metodos con excepciones
 *         perzonalizadas
 */
public interface ExceptionsService {

	/**
	 * Metodo que permite mostrar una excepcion personalizada
	 * @param mensaje texto a mostrar al usuario
	 * @throws MyException
	 */
	void mostrarExcepcionPerzonalizada(String mensaje) throws MyException;
}
