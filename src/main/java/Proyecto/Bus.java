package Proyecto;

import java.util.ArrayList;

/**
 * La clase  Bus representa un bus.
 */
public abstract class Bus {
    private ArrayList<Asiento> asientosBus;

    /**
     * Constructor de la clase Bus.
     * Inicializa la lista de asientos del bus y llama al método agregarAsientos().
     */
    public Bus() {
        asientosBus = new ArrayList<Asiento>();
        agregarAsientos();
    }

    /**
     * Método para agregar los asientos del bus.
     * Cada subclase debe implementar este método para ver cada cosa sobre los asientos.
     */
    public abstract void agregarAsientos();

    /**
     * Agrega un asiento a la lista de asientos del bus.
     *
     * @param asiento el asiento a agregar
     */
    public void AñadeAsiento(Asiento asiento) {
        asientosBus.add(asiento);
    }

    /**
     * extrae el asiento.
     *
     * @param indice el índice del asiento
     * @return el asiento en el índice, o null si el índice está fuera de rango
     */
    public Asiento getAsiento(int indice) {
        if (indice >= 0 && indice < asientosBus.size()) {
            return asientosBus.get(indice);
        } else {
            return null;
        }
    }

    /**
     * extrae el origen del bus.
     *
     * @return el origen del bus
     */
    public abstract Recorrido getOrigen();

    /**
     * extrae el destino del bus.
     *
     * @return el destino del bus
     */
    public abstract Recorrido getDestino();

    /**
     * extrae el horario del bus.
     *
     * @return el horario del bus
     */
    public abstract String getHorario();

    /**
     * extrae el tipo de bus.
     *
     * @return el tipo de bus
     */
    public abstract int tipo();

    /**
     * extrae el precio de un asiento Semi cama en el bus.
     *
     * @return el precio de un asiento semicama
     */
    public abstract int precioAsientoSemiCama();

    /**
     * Obtiene el precio de un asiento salon cama en el bus.
     *
     * @return el precio de un asiento salon cama
     */
    public abstract int precioAsientoSalonCama();

    /**
     * Obtiene el precio de un asiento vip en el bus.
     *
     * @return el precio de un asiento vip
     */
    public abstract int precioAsientoSalonVip();
}