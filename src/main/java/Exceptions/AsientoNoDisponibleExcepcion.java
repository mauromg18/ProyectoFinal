package Exceptions;

/*
*@ProductoNoDisponibleExcepcion es una clase que trabaja con Exception
esta es utilizada para enviar un mensaje de error en el caso de que
no queden Asientos disponibles en el bus.
*/
public class AsientoNoDisponibleExcepcion extends Exception{
    public AsientoNoDisponibleExcepcion(String errorMesagge){
        super(errorMesagge);
    }
}