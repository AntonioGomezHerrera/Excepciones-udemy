/**
 * 
 */
package cutomsexceptions;

/**
 * @author Nokster
 * Clase que representa una excepcionc checked
 * Toda clase que hereda de Exception automaticamente es una excepcion Check
 */
public class MyException extends Exception {
	
	/**
	 * Constructor default
	 */
	public MyException() {
		
	}
	
	public MyException(String mensaje) {
		super(mensaje);
	}
}
