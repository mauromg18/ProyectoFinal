package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Asiento.
 */
public class AsientoTest {
    private Asiento asiento;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        asiento = new Asiento("Asiento semi cama") {
            @Override
            public String getTipo() {
                return "Asiento para probar";
            }
        };
    }

    /**
     * Prueba para obtener el número de serie del asiento.
     */
    @Test
    public void testGetSerie() {
        asiento.setSerie(17);
        Assertions.assertEquals(17, asiento.getSerie());
    }

    /**
     * Prueba para cambiar el estado del asiento.
     */
    @Test
    public void testCambiarEstado() {
        Assertions.assertFalse(asiento.getStatus());
        asiento.cambiarEstado();
        Assertions.assertTrue(asiento.getStatus());
        asiento.cambiarEstado();
        Assertions.assertFalse(asiento.getStatus());
    }

    /**
     * Prueba para obtener el tipo de asiento.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento para probar", asiento.getTipo());
    }
}