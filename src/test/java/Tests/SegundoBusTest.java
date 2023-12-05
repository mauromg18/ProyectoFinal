package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase SegundoBus.
 */
public class SegundoBusTest {
    private SegundoBus segundoBus;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        segundoBus = new SegundoBus(Recorrido.CHILLAN, Recorrido.TALCA, "13:00");
    }

    /**
     * Prueba para verificar que la lista de asientos del segundo bus se haya creado correctamente.
     */
    @Test
    public void testAgregarAsientos() {
    }

    /**
     * Prueba para obtener el origen del segundo bus.
     */
    @Test
    public void testGetOrigen() {
        Assertions.assertEquals(Recorrido.CHILLAN, segundoBus.getOrigen());
    }

    /**
     * Prueba para obtener el destino del segundo bus.
     */
    @Test
    public void testGetDestino() {
        Assertions.assertEquals(Recorrido.TALCA, segundoBus.getDestino());
    }

    /**
     * Prueba para obtener el horario del segundo bus.
     */
    @Test
    public void testGetHorario() {
        Assertions.assertEquals("13:00", segundoBus.getHorario());
    }

    /**
     * Prueba para obtener el tipo del segundo bus.
     */
    @Test
    public void testTipo() {
        Assertions.assertEquals(2, segundoBus.tipo());
    }

    /**
     * Prueba para obtener el precio de un asiento semi cama del segundo bus.
     */
    @Test
    public void testPrecioAsientoSemiCama() {
        Assertions.assertEquals(4500, segundoBus.precioAsientoSemiCama());
    }

    /**
     * Prueba para obtener el precio de un asiento salon cama del segundo bus.
     */
    @Test
    public void testPrecioAsientoSalonCama() {
        Assertions.assertEquals(5500, segundoBus.precioAsientoSalonCama());
    }

    /**
     * Prueba para obtener el precio de un asiento salon vip del segundo bus.
     */
    @Test
    public void testPrecioAsientoSalonVip() {
        Assertions.assertEquals(7000, segundoBus.precioAsientoSalonVip());
    }
}