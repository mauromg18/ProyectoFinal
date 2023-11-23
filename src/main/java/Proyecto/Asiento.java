package Proyecto;

/**
 * La clase Asiento representa un asiento.
 */
public abstract class Asiento {
    private boolean estado;
    private int serie;
    private String tipo;

    /**
     * Constructor de la clase Asiento.
     */
    public Asiento(String s) {
    }

    /**
     * determina el número de serie del asiento.
     *
     * @param serie el número de serie que se determina
     */
    public void setSerie(int serie) {
        this.serie = serie;
    }

    /**
     * extrae el número de serie del asiento.
     *
     * @return el número de serie del asiento
     */
    public int getSerie() {
        return serie;
    }

    /**
     * extrae el estado del asiento.
     *
     * @return el estado del asiento (verdadero si está ocupado, falso si está desocupado)
     */
    public boolean getStatus() {
        return estado;
    }

    /**
     * Cambia el estado del asiento en cuestion.
     * Intercambia los estados dependiendo en cual se encuentre
     */
    public void cambiarEstado() {
        if (estado) {
            estado = false;
        } else {
            estado = true;
        }
    }

    /**
     * Extrae el tipo de asiento.
     *
     * @return el tipo de asiento
     */
    public abstract String getTipo();
}