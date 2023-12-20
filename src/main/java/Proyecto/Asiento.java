package Proyecto;

/**
 * La clase abstracta Asiento representa un asiento genérico.
 */
public abstract class Asiento {
    private boolean status;
    private int serie;
    private String tipo;

    /**
     * Constructor por defecto de la clase Asiento.
     */
    public Asiento(String s) {
    }

    /**
     * Establece el número de serie del asiento.
     *
     * @param serie el número de serie a establecer
     */
    public void setSerie(int serie) {
        this.serie = serie;
    }

    /**
     * Obtiene el número de serie del asiento.
     *
     * @return el número de serie del asiento
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Obtiene el estado del asiento.
     *
     * @return el estado del asiento (true si está ocupado, false si está libre)
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Cambia el estado del asiento.
     * Si el estado actual es ocupado, lo cambia a libre. Si el estado actual es libre, lo cambia a ocupado.
     */
    public void cambiarStatus() {
        if (status) {
            status = false;
        } else {
            status = true;
        }
    }

    /**
     * Obtiene el tipo de asiento.
     *
     * @return el tipo de asiento
     */
    public abstract String getTipo();
}