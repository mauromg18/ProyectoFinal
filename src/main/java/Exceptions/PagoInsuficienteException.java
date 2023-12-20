package Exceptions;

/*
*@PagoInsuficienteException es una clase que trabaja con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
el pago hecho en el expendedor sea insuficiente, osea que se pagó
menos del precio asociado a cierto producto.
*/
public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String errorMesagge){
        super(errorMesagge);
    }
}