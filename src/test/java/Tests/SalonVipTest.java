package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase SalonVip.
 */
public class SalonVipTest {
    private SalonVip salonVip;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        salonVip = new SalonVip(900);
    }

    /**
     * Prueba para obtener el precio del asiento salon vip.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(900, salonVip.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento salon vip.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento salon vip", salonVip.getTipo());
    }
}