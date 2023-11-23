package Proyecto;
/**
 * La clase SemiCama representa la clase de asiento mas basico
 */
public class SemiCama extends Asiento {
    private int precio;

    /**
     * Constructor de la clase SemiCama.
     *
     * @param precio el precio del asiento semi cama
     */
    public SemiCama(int precio) {
        super("Asiento semi cama");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento semi cama.
     *
     * @return el precio del asiento semi cama
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento semi cama")
     */
    @Override
    public String getTipo() {
        return "Asiento semi cama";
    }
}