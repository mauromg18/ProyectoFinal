package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase PrimerBus.
 */
public class PrimerBusTest {
    private PrimerBus primerBus;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        primerBus = new PrimerBus(Recorrido.CONCEPCION, Recorrido.CHILLAN, "10:00");
    }

    /**
     * Prueba para verificar que la lista de asientos del primer bus se haya creado correctamente.
     */
    @Test
    public void testAgregarAsientos() {
    }

    /**
     * Prueba para obtener el origen del primer bus.
     */
    @Test
    public void testGetOrigen() {
        Assertions.assertEquals(Recorrido.CONCEPCION, primerBus.getOrigen());
    }

    /**
     * Prueba para obtener el destino del primer bus.
     */
    @Test
    public void testGetDestino() {
        Assertions.assertEquals(Recorrido.CHILLAN, primerBus.getDestino());
    }

    /**
     * Prueba para obtener el horario del primer bus.
     */
    @Test
    public void testGetHorario() {
        Assertions.assertEquals("10:00", primerBus.getHorario());
    }

    /**
     * Prueba para obtener el tipo del primer bus.
     */
    @Test
    public void testTipo() {
        Assertions.assertEquals(1, primerBus.tipo());
    }

    /**
     * Prueba para obtener el precio de un asiento semi cama del primer bus.
     */
    @Test
    public void testPrecioAsientoSemiCama() {
        Assertions.assertEquals(3500, primerBus.precioAsientoSemiCama());
    }

    /**
     * Prueba para obtener el precio de un asiento salon cama del primer bus.
     */
    @Test
    public void testPrecioAsientoSalonCama() {
        Assertions.assertEquals(4500, primerBus.precioAsientoSalonCama());
    }

    /**
     * Prueba para obtener el precio de un asiento salon vip del primer bus.
     */
    @Test
    public void testPrecioAsientoSalonVip() {
        Assertions.assertEquals(6000, primerBus.precioAsientoSalonVip());
    }
}