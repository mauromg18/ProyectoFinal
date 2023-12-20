package Exceptions;

/*
 *@YaComproExcepcion es una clase que trabaja con Exception
 * esta es utilizada para enviar un mensaje de error en el caso de que
 * el Comprador trate de hacer una compra luego de ya haber hecho una previamente,
 * sin esperar el tiempo necesario para finalizar su compra anterior.
 */
public class YaComproException extends Exception{
    public YaComproException(String errorMesagge){
        super(errorMesagge);
    }
}
