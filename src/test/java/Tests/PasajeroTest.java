package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Pasajero.
 */
class PasajeroTest {

    private Pasajero pasajero;
    private Asiento asiento1;
    private Asiento asiento2;

    /**
     * Configuración inicial para cada prueba.
     */
    @BeforeEach
    void setUp() {
        pasajero = new Pasajero();
        asiento1 = new Asiento("Asiento semi cama") {
            @Override
            public String getTipo() {
                return null;
            }
        };
        asiento2 = new Asiento("Asiento salon vip") {
            @Override
            public String getTipo() {
                return null;
            }
        };
    }

    /**
     * Prueba unitaria para el método addAsientosSeleccionado().
     */
    @Test
    void testAddAsientosSeleccionado() {
        pasajero.addAsientosSeleccionado(asiento1);
        pasajero.addAsientosSeleccionado(asiento2);
        Assertions.assertEquals(2, pasajero.getAsientosSeleccionado().size());
        Assertions.assertEquals(asiento1, pasajero.getAsientosSeleccionado(0));
        Assertions.assertEquals(asiento2, pasajero.getAsientosSeleccionado(1));
    }

    /**
     * Prueba unitaria para el método removeAsientosSeleccionado().
     */
    @Test
    void testRemoveAsientosSeleccionado() {
        pasajero.addAsientosSeleccionado(asiento1);
        pasajero.addAsientosSeleccionado(asiento2);

        pasajero.removeAsientosSeleccionado(asiento1);
        Assertions.assertEquals(1, pasajero.getAsientosSeleccionado().size());
        Assertions.assertEquals(asiento2, pasajero.getAsientosSeleccionado(0));

        pasajero.removeAsientosSeleccionado(asiento2);
        Assertions.assertEquals(0, pasajero.getAsientosSeleccionado().size());
    }

    /**
     * Prueba unitaria para el método numAsientosSeleccionado().
     */
    @Test
    void testNumAsientosSeleccionado() {
        pasajero.addAsientosSeleccionado(asiento1);
        pasajero.addAsientosSeleccionado(asiento2);

        pasajero.numAsientosSeleccionado();

        Assertions.assertEquals(0, pasajero.getNumAsientosSemiCama());
        Assertions.assertEquals(0, pasajero.getNumAsientosSalonCama());
        Assertions.assertEquals(0, pasajero.getNumAsientosSalonVip());
    }

    /**
     * Prueba unitaria para el método resetNumAsientosSeleccionado().
     */
    @Test
    void testResetNumAsientosSeleccionado() {
        pasajero.addAsientosSeleccionado(asiento1);
        pasajero.addAsientosSeleccionado(asiento2);

        pasajero.numAsientosSeleccionado();
        pasajero.resetNumAsientosSeleccionado();

        Assertions.assertEquals(0, pasajero.getNumAsientosSemiCama());
        Assertions.assertEquals(0, pasajero.getNumAsientosSalonCama());
        Assertions.assertEquals(0, pasajero.getNumAsientosSalonVip());
    }
}