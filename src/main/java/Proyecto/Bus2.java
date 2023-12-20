package Proyecto;

import java.lang.ref.SoftReference;

/**
 * La clase Bus2 representa otro tipo específico de bus que hereda de la clase Bus.
 */
public class Bus2 extends Bus {
    private Recorridos origen;
    private Recorridos destino;
    private String horario;
    private int precioAsientoNormal;
    private int precioAsientoPremium;
    private int precioAsientoVIP;

    /**
     * Constructor de la clase Bus2.
     *
     * @param origen  el origen del recorrido del bus
     * @param destino el destino del recorrido del bus
     * @param horario el horario del bus
     */
    public Bus2(Recorridos origen, Recorridos destino, String horario) {
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        precioAsientoNormal = 1500;
        precioAsientoPremium = 2500;
        precioAsientoVIP = 4000;
    }

    /**
     * Método para agregar los asientos al bus.
     * Se crean instancias de AsientoNormal, AsientoPremium y AsientoVIP y se agregan a la lista de asientos del bus.
     */
    public void agregarAsientos() {
        for (int i = 0; i < 14; i++) {
            AsientoNormal asientito = new AsientoNormal(1500);
            addAsiento(asientito);
        }
        for (int i = 0; i < 6; i++) {
            AsientoPremium asientito = new AsientoPremium(2500);
            addAsiento(asientito);
        }
        for (int i = 0; i < 10; i++) {
            AsientoVIP asientito = new AsientoVIP(4000);
            addAsiento(asientito);
        }
    }

    /**
     * Obtiene el origen del recorrido del bus.
     *
     * @return el origen del recorrido del bus
     */
    public Recorridos getOrigen() {
        return origen;
    }

    /**
     * Obtiene el destino del recorrido del bus.
     *
     * @return el destino del recorrido del bus
     */
    public Recorridos getDestino() {
        return destino;
    }

    /**
     * Obtiene el horario del bus.
     *
     * @return el horario del bus
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Obtiene el tipo de bus.
     *
     * @return el tipo de bus (2 en este caso)
     */
    public int tipo() {
        return 2;
    }

    /**
     * Obtiene el precio de un asiento normal en el bus.
     *
     * @return el precio de un asiento normal
     */
    public int precioAsientoNormal() {
        return precioAsientoNormal;
    }

    /**
     * Obtiene el precio de un asiento premium en el bus.
     *
     * @return el precio de un asiento premium
     */
    public int precioAsientoPremium() {
        return precioAsientoPremium;
    }

    /**
     * Obtiene el precio de un asiento VIP en el bus.
     *
     * @return el precio de un asiento VIP
     */
    public int precioAsientoVIP() {
        return precioAsientoVIP;
    }
}