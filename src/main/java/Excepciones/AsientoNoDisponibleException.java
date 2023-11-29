package Excepciones;
/*
*@ProductoNoDisponibleExcepcion es una clase que interactua con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
no queden Asiento disponibles en el bus.
*/
public class AsientoNoDisponibleException extends Exception{
    public AsientoNoDisponibleException(String errorMesagge){
        super(errorMesagge);
    }
}