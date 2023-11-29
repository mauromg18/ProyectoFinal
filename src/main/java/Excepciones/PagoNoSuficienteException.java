package Excepciones;
/*
*@PagoNoSuficienteException es una clase que interactua con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
el pago hecho en el expendedor no sea suficiente, osea que se pagó
menos del precio que vale el ticket.
*/
public class PagoNoSuficienteException extends Exception{
    public PagoNoSuficienteException(String errorMesagge){
        super(errorMesagge);
    }
}
