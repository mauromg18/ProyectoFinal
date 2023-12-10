package Proyecto;

import java.lang.ref.SoftReference;
/**
 * La clase SegundoBus representa un tipo específico de bus.
 */
public class SegundoBus extends Bus {
    private Recorrido origen;
    private Recorrido destino;
    private String horario;
    private int precioAsientoSemiCama;
    private int precioAsientoSalonCama;
    private int precioAsientoSalonVip;

    /**
     * Constructor de la clase SegundoBus.
     *
     * @param origen  el origen del recorrido del bus
     * @param destino el destino del recorrido del bus
     * @param horario el horario del bus
     */
    public SegundoBus(Recorrido origen, Recorrido destino, String horario) {
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        precioAsientoSemiCama = 4500;
        precioAsientoSalonCama = 5500;
        precioAsientoSalonVip = 7000;
    }

    /**
     * Método para agregar los asientos al bus.
     * Se crean instancias de AsientoSemiCama, AsientoSalonCama y AsientoSalonVip y se agregan a la lista de asientos del bus.
     */
    public void agregarAsientos() {
        for (int i = 0; i < 24; i++) {
            SemiCama asientos = new SemiCama(precioAsientoSemiCama);
            addAsiento(asientos);
        }
        for (int i = 0; i < 10; i++) {
            SalonCama asientos = new SalonCama(precioAsientoSalonCama);
            addAsiento(asientos);
        }
        for (int i = 0; i < 6; i++) {
            SalonVip asientos = new SalonVip(precioAsientoSalonVip);
            addAsiento(asientos);
        }
    }

    /**
     * extrae el origen del recorrido del bus.
     *
     * @return el origen del recorrido del bus
     */
    public Recorrido getOrigen() {
        return origen;
    }

    /**
     * extrae el destino del recorrido del bus.
     *
     * @return el destino del recorrido del bus
     */
    public Recorrido getDestino() {
        return destino;
    }

    /**
     * extrae el horario del bus.
     *
     * @return el horario del bus
     */
    public String getHorario() {
        return horario;
    }

    /**
     * extrae el tipo de bus.
     *
     * @return el tipo de bus (2 en este caso)
     */
    public int tipo() {
        return 2;
    }

    /**
     * extrae el precio de un asiento semi cama en el bus.
     *
     * @return el precio de un asiento semicama
     */
    public int precioAsientoSemiCama() {
        return precioAsientoSemiCama;
    }

    /**
     * extrae el precio de un asiento salon cama en el bus.
     *
     * @return el precio de un asiento salon cama
     */
    public int precioAsientoSalonCama() {
        return precioAsientoSalonCama;
    }

    /**
     * Obtiene el precio de un asiento vip en el bus.
     *
     * @return el precio de un asiento vip
     */
    public int precioAsientoSalonVip() {
        return precioAsientoSalonVip;
    }
}