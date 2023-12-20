package Proyecto;

/**
 * La clase AsientoPremium representa un tipo de asiento premium que hereda de la clase Asiento.
 */
public class AsientoPremium extends Asiento {
    private int precio;

    /**
     * Constructor de la clase AsientoPremium.
     *
     * @param precio el precio del asiento premium
     */
    public AsientoPremium(int precio) {
        super("Asiento normal");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento premium.
     *
     * @return el precio del asiento premium
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento premium")
     */
    @Override
    public String getTipo() {
        return "Asiento premium";
    }
}