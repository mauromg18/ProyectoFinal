package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Bus1.
 */
public class Bus1Test {
    private Bus1 bus1;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        bus1 = new Bus1(Recorridos.CONCEPCION, Recorridos.CHILLAN, "10:00");
    }

    /**
     * Prueba para verificar que la lista de asientos del bus1 se haya creado correctamente.
     */
    @Test
    public void testAgregarAsientos() {
    }

    /**
     * Prueba para obtener el origen del bus1.
     */
    @Test
    public void testGetOrigen() {
        Assertions.assertEquals(Recorridos.CONCEPCION, bus1.getOrigen());
    }

    /**
     * Prueba para obtener el destino del bus1.
     */
    @Test
    public void testGetDestino() {
        Assertions.assertEquals(Recorridos.CHILLAN, bus1.getDestino());
    }

    /**
     * Prueba para obtener el horario del bus1.
     */
    @Test
    public void testGetHorario() {
        Assertions.assertEquals("10:00", bus1.getHorario());
    }

    /**
     * Prueba para obtener el tipo del bus1.
     */
    @Test
    public void testTipo() {
        Assertions.assertEquals(1, bus1.tipo());
    }

    /**
     * Prueba para obtener el precio de un asiento normal del bus1.
     */
    @Test
    public void testPrecioAsientoNormal() {
        Assertions.assertEquals(1000, bus1.precioAsientoNormal());
    }

    /**
     * Prueba para obtener el precio de un asiento premium del bus1.
     */
    @Test
    public void testPrecioAsientoPremium() {
        Assertions.assertEquals(1500, bus1.precioAsientoPremium());
    }

    /**
     * Prueba para obtener el precio de un asiento VIP del bus1.
     */
    @Test
    public void testPrecioAsientoVIP() {
        Assertions.assertEquals(3000, bus1.precioAsientoVIP());
    }
}