package Proyecto;

/**
 * La clase AsientoNormal representa un tipo de asiento normal que hereda de la clase Asiento.
 */
public class AsientoNormal extends Asiento {
    private int precio;

    /**
     * Constructor de la clase AsientoNormal.
     *
     * @param precio el precio del asiento normal
     */
    public AsientoNormal(int precio) {
        super("Asiento normal");
        this.precio = precio;
    }

    /**
     * Obtiene el precio del asiento normal.
     *
     * @return el precio del asiento normal
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento ("Asiento normal")
     */
    @Override
    public String getTipo() {
        return "Asiento normal";
    }
}