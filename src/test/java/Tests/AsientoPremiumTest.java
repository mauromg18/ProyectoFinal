package Tests;
import Proyecto.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase AsientoPremium.
 */
public class AsientoPremiumTest {
    private AsientoPremium asientoPremium;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        asientoPremium = new AsientoPremium(200);
    }

    /**
     * Prueba para obtener el precio del asiento premium.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(200, asientoPremium.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento premium.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento premium", asientoPremium.getTipo());
    }
}