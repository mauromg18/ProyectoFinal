package Proyecto;

/**
 * La clase AsientoVIP representa un tipo de asiento VIP que hereda de la clase Asiento.
 */
public class AsientoVIP extends Asiento {
    private int precio;

    /**
     * Constructor de la clase AsientoVIP.
     *
     * @param precio el precio del asiento VIP
     */
    public AsientoVIP(int precio) {
        super("Asiento normal");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento VIP.
     *
     * @return el precio del asiento VIP
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento VIP")
     */
    @Override
    public String getTipo() {
        return "Asiento VIP";
    }
}