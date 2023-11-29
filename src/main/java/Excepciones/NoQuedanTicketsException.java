package Excepciones;

/*
 *@NoQuedanTicketsException es una clase que interactua con Exception,
 * esta es utilizada para enviar un mensaje de error en el caso de que no
 * quedase ningun ticket disponible.
 */
public class NoQuedanTicketsException extends Exception{
    public NoQuedanTicketsException(String errorMesagge){
        super(errorMesagge);
    }
}