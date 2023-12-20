package Exceptions;

/*
 *@PagoIncorrectoException es una clase que trabaja con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que
 * el pago hecho en al bus sea incorrecto, dependiendo del caso
 * hace llamado a una funcion u otra.
 */
public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMesagge){
        super(errorMesagge);
    }
}
