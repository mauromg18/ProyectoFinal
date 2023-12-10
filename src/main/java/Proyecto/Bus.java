package Proyecto;
import java.util.ArrayList;
/**
 * La clase abstracta Bus representa un bus.
 */
public abstract class Bus {
    private ArrayList<Asiento> asientosBus;
    /**
     * Constructor por defecto de la clase Bus.
     * Inicializa la lista de asientos del bus y llama al método agregarAsientos().
     */
    public Bus() {
        asientosBus = new ArrayList<Asiento>();
        agregarAsientos();
    }
    /**
     * Método abstracto para agregar los asientos al bus.
     * Cada subclase debe implementar este método.
     */
    public abstract void agregarAsientos();

    /**
     * Agrega un asiento a la lista de asientos del bus.
     *
     * @param asiento el asiento a agregar
     */
    public void addAsiento(Asiento asiento) {
        asientosBus.add(asiento);
    }

    /**
     * Obtiene el asiento en el índice requerido.
     * @param indice el índice del asiento
     * @return el asiento en el índice requerido, o null si el índice está fuera de rango
     */
    public Asiento getAsiento(int indice) {
        if (indice >= 0 && indice < asientosBus.size()) {
            return asientosBus.get(indice);
        } else {
            return null;
        }
    }

    /**
     * Obtiene el origen del recorrido del bus.
     *
     * @return el origen del recorrido del bus
     */
    public abstract Recorrido getOrigen();

    /**
     * Obtiene el destino del recorrido del bus.
     *
     * @return el destino del recorrido del bus
     */
    public abstract Recorrido getDestino();

    /**
     * Obtiene el horario del bus.
     *
     * @return el horario del bus
     */
    public abstract String getHorario();

    /**
     * Obtiene el tipo de bus.
     *
     * @return el tipo de bus
     */
    public abstract int tipo();

    /**
     * Obtiene el precio de un asiento semi cama en el bus.
     *
     * @return el precio de un asiento semi cama
     */
    public abstract int precioAsientoSemiCama();

    /**
     * Obtiene el precio de un asiento salon cama en el bus.
     *
     * @return el precio de un asiento salon cama
     */
    public abstract int precioAsientoSalonCama();

    /**
     * Obtiene el precio de un asiento salon vip en el bus.
     *
     * @return el precio de un asiento salon vip
     */
    public abstract int precioAsientoSalonVip();
}
