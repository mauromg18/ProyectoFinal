package Excepciones;

/*
 *@NoHayProductoExcepcion es una clase que interactua con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que el Bus
 * este completamente ocupado.
 */
public class NoQuedanAsientosException extends Exception{
    public NoQuedanAsientosException(String errorMesagge){
        super(errorMesagge);
    }
}