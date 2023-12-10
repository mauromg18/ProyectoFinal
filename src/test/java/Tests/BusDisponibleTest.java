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
        PrimerBus primerbus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "13:00 AM");
        busDisponible.addBus(primerbus);
        Assertions.assertEquals(primerbus, busDisponible.getBus(0));
    }

    /**
     * Prueba unitaria para el método addBusDisponible().
     */
    @Test
    public void testAddBusDisponible() {
        PrimerBus primerbus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "13:00 AM");
        busDisponible.addBusDisponible(primerbus);
        Assertions.assertEquals(primerbus, busDisponible.getBusDisponible(0));
    }

    /**
     * Prueba unitaria para el método getBus().
     */
    @Test
    public void testGetBus() {
        PrimerBus primerbus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "13:00 AM");
        busDisponible.addBus(primerbus);
        Bus bus = busDisponible.getBus(0);
        Assertions.assertEquals(primerbus, bus);
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
        busDisponible.filtrarBuses(Recorrido.CONCEPCION, Recorrido.CHILLAN, "13:00 AM");
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
        PrimerBus primerbus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "13:00 AM");
        busDisponible.addBusDisponible(primerbus);
        Bus bus = busDisponible.getBusDisponible(0);
        Assertions.assertEquals(primerbus, bus);
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