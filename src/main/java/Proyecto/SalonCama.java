package Proyecto;
/**
 * La clase SalonCama representa un tipo de asiento de calidad intermedia
 */
public class SalonCama extends Asiento {
    private int precio;

    /**
     * Constructor de la clase Salon cama.
     *
     * @param precio el precio del asiento salon cama
     */
    public SalonCama(int precio) {
        super("Asiento salon cama");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento salon cama.
     *
     * @return el precio del asiento salon cama
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento salon cama")
     */
    @Override
    public String getTipo() {
        return "Asiento salon cama";
    }
}