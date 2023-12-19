package Tests;
import Proyecto.*;
import org.junit.jupiter.api.*;

/**
 * Pruebas unitarias para la clase Bus2.
 */
public class Bus2Test {

    private Bus2 bus2;

    /**
     * Configuración inicial para cada prueba.
     */
    @BeforeEach
    public void setUp() {
        Recorridos origen = Recorridos.CONCEPCION;
        Recorridos destino = Recorridos.SANTIAGO;
        String horario = "10:00 AM";
        bus2 = new Bus2(origen, destino, horario);
    }

    /**
     * Prueba unitaria para el método agregarAsientos().
     */
    @Test
    public void testAgregarAsientos() {
    }

    /**
     * Prueba unitaria para el método getOrigen().
     */
    @Test
    public void testGetOrigen() {
        Recorridos origen = bus2.getOrigen();
        Assertions.assertNotNull(origen);
    }

    /**
     * Prueba unitaria para el método getDestino().
     */
    @Test
    public void testGetDestino() {
        Recorridos destino = bus2.getDestino();
        Assertions.assertNotNull(destino);
    }

    /**
     * Prueba unitaria para el método getHorario().
     */
    @Test
    public void testGetHorario() {
        String horario = bus2.getHorario();
        Assertions.assertEquals("10:00 AM", horario);
    }

    /**
     * Prueba unitaria para el método tipo().
     */
    @Test
    public void testTipo() {
        int tipo = bus2.tipo();
        Assertions.assertEquals(2, tipo);
    }

    /**
     * Prueba unitaria para el método precioAsientoNormal().
     */
    @Test
    public void testPrecioAsientoNormal() {
        int precio = bus2.precioAsientoNormal();
        Assertions.assertEquals(1500, precio);
    }

    /**
     * Prueba unitaria para el método precioAsientoPremium().
     */
    @Test
    public void testPrecioAsientoPremium() {
        int precio = bus2.precioAsientoPremium();
        Assertions.assertEquals(2500, precio);
    }

    /**
     * Prueba unitaria para el método precioAsientoVIP().
     */
    @Test
    public void testPrecioAsientoVIP() {
        int precio = bus2.precioAsientoVIP();
        Assertions.assertEquals(4000, precio);
    }
}