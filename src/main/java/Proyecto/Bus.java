package Proyecto;

import java.util.ArrayList;

/**
 * La clase abstracta Bus representa un bus genérico.
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
     * Cada subclase debe implementar este método para definir la lógica específica de los asientos.
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
     * Obtiene el asiento en el índice especificado.
     *
     * @param indice el índice del asiento
     * @return el asiento en el índice especificado, o null si el índice está fuera de rango
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
    public abstract Recorridos getOrigen();

    /**
     * Obtiene el destino del recorrido del bus.
     *
     * @return el destino del recorrido del bus
     */
    public abstract Recorridos getDestino();

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
     * Obtiene el precio de un asiento normal en el bus.
     *
     * @return el precio de un asiento normal
     */
    public abstract int precioAsientoNormal();

    /**
     * Obtiene el precio de un asiento premium en el bus.
     *
     * @return el precio de un asiento premium
     */
    public abstract int precioAsientoPremium();

    /**
     * Obtiene el precio de un asiento VIP en el bus.
     *
     * @return el precio de un asiento VIP
     */
    public abstract int precioAsientoVIP();
}