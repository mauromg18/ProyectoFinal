package Excepciones;

/*
 *@SinFinalizarExcepcion es una clase que interactua con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que
 * el Comprador trate de hacer una compra luego de ya haber echo una previamente,
 * sin esperar el tiempo necesario para finalizar su compra anterior.
 */
public class SinFinalizarException extends Exception{
    public SinFinalizarException(String errorMesagge){
        super(errorMesagge);
    }
}