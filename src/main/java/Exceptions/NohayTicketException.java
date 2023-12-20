package Exceptions;
/*
 *@NoHayTicketException es una clase que trabaja con Exception,
 * esta es utilizada para enviar un mensaje de error en el caso de que no
 * quedase ningun ticket para comprar.
 */
public class NohayTicketException extends Exception{
    public NohayTicketException(String errorMesagge){
        super(errorMesagge);
    }
}