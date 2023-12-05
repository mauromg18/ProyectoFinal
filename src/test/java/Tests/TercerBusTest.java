package Tests;
import Proyecto.*;
import org.junit.jupiter.api.*;

/**
 * Pruebas unitarias para la clase TercerBus.
 */
public class TercerBusTest {

    private TercerBus tercerBus;

    /**
     * Configuración inicial para cada prueba.
     */
    @BeforeEach
    public void setUp() {
        Recorrido origen = Recorrido.TALCA;
        Recorrido destino = Recorrido.CHILOE;
        String horario = "17:00 PM";
        tercerBus = new TercerBus(origen, destino, horario);
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
        Recorrido origen = tercerBus.getOrigen();
        Assertions.assertNotNull(origen);
    }

    /**
     * Prueba unitaria para el método getDestino().
     */
    @Test
    public void testGetDestino() {
        Recorrido destino = tercerBus.getDestino();
        Assertions.assertNotNull(destino);
    }

    /**
     * Prueba unitaria para el método getHorario().
     */
    @Test
    public void testGetHorario() {
        String horario = tercerBus.getHorario();
        Assertions.assertEquals("17:00 PM", horario);
    }

    /**
     * Prueba unitaria para el método tipo().
     */
    @Test
    public void testTipo() {
        int tipo = tercerBus.tipo();
        Assertions.assertEquals(3, tipo);
    }

    /**
     * Prueba unitaria para el método precioAsientoSemiCama().
     */
    @Test
    public void testPrecioAsientoSemiCama() {
        int precio = tercerBus.precioAsientoSemiCama();
        Assertions.assertEquals(10000, precio);
    }

    /**
     * Prueba unitaria para el método precioAsientoSalonCama().
     */
    @Test
    public void testPrecioAsientoSalonCama() {
        int precio = tercerBus.precioAsientoSalonCama();
        Assertions.assertEquals(13000, precio);
    }

    /**
     * Prueba unitaria para el método precioAsientoSalonVip().
     */
    @Test
    public void testPrecioAsientoSalonVip() {
        int precio = tercerBus.precioAsientoSalonVip();
        Assertions.assertEquals(16000, precio);
    }
}