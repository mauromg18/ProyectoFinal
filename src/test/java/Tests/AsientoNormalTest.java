package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase AsientoNormal.
 */
public class AsientoNormalTest {
    private AsientoNormal asientoNormal;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        asientoNormal = new AsientoNormal(100);
    }

    /**
     * Prueba para obtener el precio del asiento normal.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(100, asientoNormal.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento normal .
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento normal", asientoNormal.getTipo());
    }
}