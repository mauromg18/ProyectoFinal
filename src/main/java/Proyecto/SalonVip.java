package Proyecto;

/**
 * La clase SalonVip representa un tipo de asiento VIP (el mas caro).
 */
public class SalonVip extends Asiento {
    private int precio;

    /**
     * Constructor de la clase SalonVip.
     *
     * @param precio el precio del asiento vip
     */
    public SalonVip(int precio) {
        super("Asiento salon vip");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento vip.
     *
     * @return el precio del asiento vip
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento vip")
     */
    @Override
    public String getTipo() {
        return "Asiento salon vip";
    }
}