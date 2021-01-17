package excepciones.services.impl;

import cutomsexceptions.MyException;
import excepciones.services.ExceptionsService;

/**
 * 
 * @author Nokster
 * Clase que implementa la interface de servicios de Excepciones
 */

public class ExceptionServiceImpl implements ExceptionsService {

	@Override
	public void mostrarExcepcionPerzonalizada(String mensaje) throws MyException {

		if (mensaje != null) {
			System.out.println(mensaje);
		} else {
			throw new MyException("El usuario no ingreso correctamente un valor ");
		}
	}

}
