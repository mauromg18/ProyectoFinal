package Excepciones;
/*
 *@PagoIncorrectoException es una clase que interactua con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que
 * el pago hecho en al bus sea incorrecto.
 */
public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMesagge){
        super(errorMesagge);
    }
}