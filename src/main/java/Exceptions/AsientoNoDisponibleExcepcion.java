package Exceptions;

/*
*@ProductoNoDisponibleExcepcion es una clase que interactua con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
no quede Asiento disponible en el bus.
*/
public class AsientoNoDisponibleExcepcion extends Exception{
    public AsientoNoDisponibleExcepcion(String errorMesagge){
        super(errorMesagge);
    }
}