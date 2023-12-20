package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Pruebas unitarias para la clase BusDisponible.
 */
public class BusDisponibleTest {

    private BusDisponible busDisponible;

    /**
     * Configuración inicial para cada prueba.
     */
    @BeforeEach
    public void setUp() {
        busDisponible = new BusDisponible();
    }

    /**
     * Prueba unitaria para el método addBus().
     */
    @Test
    public void testAddBus() {
        Bus1 bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00 AM");
        busDisponible.addBus(bus1);
        Assertions.assertEquals(bus1, busDisponible.getBus(0));
    }

    /**
     * Prueba unitaria para el método addBusDisponible().
     */
    @Test
    public void testAddBusDisponible() {
        Bus1 bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00 AM");
        busDisponible.addBusDisponible(bus1);
        Assertions.assertEquals(bus1, busDisponible.getBusDisponible(0));
    }

    /**
     * Prueba unitaria para el método getBus().
     */
    @Test
    public void testGetBus() {
        Bus1 bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00 AM");
        busDisponible.addBus(bus1);
        Bus bus = busDisponible.getBus(0);
        Assertions.assertEquals(bus1, bus);
    }

    /**
     * Prueba unitaria para el método getBus() cuando el índice está fuera de rango.
     */
    @Test
    public void testGetBusReturnsNullIfIndexOutOfRange() {
        Bus bus = busDisponible.getBus(100);
        Assertions.assertNull(bus);
    }

    /**
     * Prueba unitaria para el método filtrarBuses().
     */
    @Test
    public void testFiltrarBuses() {
        busDisponible.filtrarBuses(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00 AM");
        Assertions.assertEquals(2, busDisponible.getBusesDisponibles().size());
    }

    /**
     * Prueba unitaria para el método getBusesDisponibles().
     */
    @Test
    public void testGetBusesDisponibles() {
        ArrayList<Bus> busesDisponibles = busDisponible.getBusesDisponibles();
        Assertions.assertNotNull(busesDisponibles);
        Assertions.assertEquals(0, busesDisponibles.size());
    }

    /**
     * Prueba unitaria para el método getBusDisponible().
     */
    @Test
    public void testGetBusDisponible() {
        Bus1 bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00 AM");
        busDisponible.addBusDisponible(bus1);
        Bus bus = busDisponible.getBusDisponible(0);
        Assertions.assertEquals(bus1, bus);
    }

    /**
     * Prueba unitaria para el método getBusDisponible() cuando el índice está fuera de rango.
     */
    @Test
    public void testGetBusDisponibleReturnsNullIfIndexOutOfRange() {
        Bus bus = busDisponible.getBusDisponible(100);
        Assertions.assertNull(bus);
    }
}