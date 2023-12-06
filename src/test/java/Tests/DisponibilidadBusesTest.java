package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
//falta revisarlo y terminarlo
/**
 * Pruebas unitarias para la clase DisponibilidadBuses.
 */
public class DisponibilidadBusesTest {

    private DisponibilidadBuses disponibilidadBuses;

    /**
     * Configuración inicial para cada prueba.
     */
    @BeforeEach
    public void setUp() {
        disponibilidadBuses = new DisponibilidadBuses();
    }

    /**
     * Prueba unitaria para el método addBus().
     */
    @Test
    public void testAddBus() {
        PrimerBus primerBus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "11:00 AM");
        disponibilidadBuses.addBus(primerBus);
        Assertions.assertEquals(primerBus, disponibilidadBuses.getBus(0));
    }

    /**
     * Prueba unitaria para el método addBusDisponible().
     */
    @Test
    public void testAddBusDisponible() {
        PrimerBus primerBus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "11:00 AM");
        disponibilidadBuses.addBusDisponible(primerBus);
        Assertions.assertEquals(primerBus, disponibilidadBuses.getBusDisponible(0));
    }

    /**
     * Prueba unitaria para el método getBus().
     */
    @Test
    public void testGetBus() {
        PrimerBus primerBus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "11:00 AM");
        disponibilidadBuses.addBus(primerBus);
        Bus bus = disponibilidadBuses.getBus(0);
        Assertions.assertEquals(primerBus, bus);
    }

    /**
     * Prueba unitaria para el método getBus() cuando el índice está fuera de rango.
     */
    @Test
    public void testGetBusReturnsNullIfIndexOutOfRange() {
        Bus bus = disponibilidadBuses.getBus(100);
        Assertions.assertNull(bus);
    }

    /**
     * Prueba unitaria para el método filtrarBuses().
     */
    @Test
    public void testFiltrarBuses() {
        disponibilidadBuses.filtrarBuses(Recorrido.CONCEPCION, Recorrido.CHILLAN, "11:00 AM");
        Assertions.assertEquals(0, disponibilidadBuses.getBusesDisponibles().size());
    }

    /**
     * Prueba unitaria para el método getBusesDisponibles().
     */
    @Test
    public void testGetBusesDisponibles() {
        ArrayList<Bus> busesDisponibles = disponibilidadBuses.getBusesDisponibles();
        Assertions.assertNotNull(busesDisponibles);
        Assertions.assertEquals(0, busesDisponibles.size());
    }

    /**
     * Prueba unitaria para el método getBusDisponible().
     */
    @Test
    public void testGetBusDisponible() {
        PrimerBus primerBus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "11:00 AM");
        disponibilidadBuses.addBusDisponible(primerBus);
        Bus bus = disponibilidadBuses.getBusDisponible(0);
        Assertions.assertEquals(primerBus, bus);
    }

    /**
     * Prueba unitaria para el método getBusDisponible() cuando el índice está fuera de rango.
     */
    @Test
    public void testGetBusDisponibleReturnsNullIfIndexOutOfRange() {
        Bus bus = disponibilidadBuses.getBusDisponible(100);
        Assertions.assertNull(bus);
    }
}