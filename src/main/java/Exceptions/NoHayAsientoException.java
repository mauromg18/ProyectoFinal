package Exceptions;

/*
 *@NoHayProductoExcepcion es una clase que trabaja con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que el Bus
 * este totalmente ocupado.
 */
public class NoHayAsientoException extends Exception{
    public NoHayAsientoException(String errorMesagge){
        super(errorMesagge);
    }
}