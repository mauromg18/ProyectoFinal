package Tests;

import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Saloncama.
 */
public class SalonCamaTest {
    private SalonCama salonCama;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        salonCama = new SalonCama(700);
    }

    /**
     * Prueba para obtener el precio del asiento salon cama.
     */
    @Test
    public void testGetPrecio() {
        Assertions.assertEquals(700, salonCama.getPrecio());
    }

    /**
     * Prueba para obtener el tipo de asiento salon cama.
     */
    @Test
    public void testGetTipo() {
        Assertions.assertEquals("Asiento salon cama", salonCama.getTipo());
    }
}