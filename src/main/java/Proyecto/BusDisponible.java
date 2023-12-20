package Proyecto;

import java.util.ArrayList;

/**
 * La clase BusDisponible se encarga de gestionar los buses disponibles y filtrarlos según el origen, destino y horario elegidos.
 */
public class BusDisponible {
    private ArrayList<Bus> buses;
    private ArrayList<Bus> busesDisponibles;

    /**
     * Constructor de la clase BusDisponible.
     * Crea instancias de Bus1 y Bus2 para todos los posibles recorridos y horarios.
     */
    public BusDisponible() {
        Horarios horario = new Horarios();
        buses = new ArrayList<>();

        for (Recorridos origen : Recorridos.values()) {
            for (Recorridos destino : Recorridos.values()) {
                if (origen != destino) {
                    for (int i = 1; i < 4; i++) {
                        Bus1 bus1 = new Bus1(origen, destino, (horario.Horario(i)));
                        addBus(bus1);
                        Bus2 bus2 = new Bus2(origen, destino, (horario.Horario(i)));
                        addBus(bus2);
                    }
                }
            }
        }
    }

    /**
     * Agrega un bus a la lista de buses.
     *
     * @param bus el bus a agregar
     */
    public void addBus(Bus bus) {
        buses.add(bus);
    }

    /**
     * Agrega un bus disponible a la lista de buses disponibles.
     *
     * @param bus el bus disponible a agregar
     */
    public void addBusDisponible(Bus bus) {
        busesDisponibles.add(bus);
    }

    /**
     * Obtiene un bus de la lista de buses.
     *
     * @param indice el índice del bus a obtener
     * @return el bus en el índice especificado, o null si el índice está fuera de rango
     */
    public Bus getBus(int indice) {
        if (indice >= 0 && indice < buses.size()) {
            return buses.get(indice);
        } else {
            return null;
        }
    }

    /**
     * Filtra los buses disponibles según el origen, destino y horario elegidos.
     *
     * @param origenElegido  el origen elegido
     * @param destinoElegido el destino elegido
     * @param horarioElegido el horario elegido
     */
    public void filtrarBuses(Recorridos origenElegido, Recorridos destinoElegido, String horarioElegido) {
        busesDisponibles = new ArrayList<>();
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getOrigen() == origenElegido && buses.get(i).getDestino() == destinoElegido && buses.get(i).getHorario() == horarioElegido) {
                addBusDisponible(buses.get(i));
            }
        }
    }

    /**
     * Obtiene la lista de buses disponibles.
     *
     * @return la lista de buses disponibles
     */
    public ArrayList<Bus> getBusesDisponibles() {
        return busesDisponibles;
    }

    /**
     * Obtiene un bus disponible de la lista de buses disponibles.
     *
     * @param indice el índice del bus disponible a obtener
     * @return el bus disponible en el índice especificado, o null si el índice está fuera de rango
     */
    public Bus getBusDisponible(int indice) {
        if (indice >= 0 && indice < busesDisponibles.size()) {
            return busesDisponibles.get(indice);
        } else {
            return null;
        }
    }
}
