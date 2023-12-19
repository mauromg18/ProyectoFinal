package Exceptions;

/*
 *@NoHayProductoExcepcion es una clase que interactua con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que el Bus
 * este ocupado completamente.
 */
public class NoHayAsientoException extends Exception{
    public NoHayAsientoException(String errorMesagge){
        super(errorMesagge);
    }
}