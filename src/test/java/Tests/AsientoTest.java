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
        asiento = new Asiento("Asiento normal") {
            @Override
            public String getTipo() {
                return "Asiento de prueba";
            }
        };
    }

    /**
     * Prueba para obtener el número de serie del asiento.
     */
    @Test
    public void testGetSerie() {
        asiento.setSerie(123);
        Assertions.assertEquals(123, asiento.getSerie());
    }

    /**
     * Prueba para cambiar el estado del asiento.
     */
    @Test
    public void testCambiarStatus() {
        Assertions.assertFalse(asiento.getStatus());
        asiento.cambiarStatus();
        Assertions.assertTrue(asiento.getStatus());
        asiento.cambiarStatus();
        Assertions.assertFalse(asiento.getStatus());
    }

    /**
     * Prueba para obtener el tipo de asiento.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento de prueba", asiento.getTipo());
    }
}