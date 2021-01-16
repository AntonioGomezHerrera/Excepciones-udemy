/**
 * 
 */
package excepciones.services;

/**
 * @author Nokster
 *Interface que proporciona los metodos de contrato para realizar operaciones aritmeticas y explique la funcionalidad 
 *de las palabras throws y thrown
 */
public interface OperacionService {
 
	double dividir(double numerador, double denominador) throws ArithmeticException;
}
