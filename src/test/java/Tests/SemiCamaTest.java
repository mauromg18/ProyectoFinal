package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase semicama.
 */
public class SemiCamaTest {
    private SemiCama semiCama;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        semiCama = new SemiCama(500);
    }

    /**
     * Prueba para obtener el precio del asiento semi cama.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(500, semiCama.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento semi cama.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento semi cama", semiCama.getTipo());
    }
}