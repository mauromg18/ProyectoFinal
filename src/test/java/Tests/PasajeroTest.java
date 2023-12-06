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
     * Prueba unitaria para el método addAsientosElegido().
     */
    @Test
    void testAddAsientosElegido() {
        pasajero.addAsientosElegido(asiento1);
        comprador.addAsientosElegido(asiento2);
        Assertions.assertEquals(2, comprador.getAsientosElegidos().size());
        Assertions.assertEquals(asiento1, comprador.getAsientosElegido(0));
        Assertions.assertEquals(asiento2, comprador.getAsientosElegido(1));
    }

    /**
     * Prueba unitaria para el método removeAsientosElegido().
     */
    @Test
    void testRemoveAsientosElegido() {
        comprador.addAsientosElegido(asiento1);
        comprador.addAsientosElegido(asiento2);

        comprador.removeAsientosElegido(asiento1);
        Assertions.assertEquals(1, comprador.getAsientosElegidos().size());
        Assertions.assertEquals(asiento2, comprador.getAsientosElegido(0));

        comprador.removeAsientosElegido(asiento2);
        Assertions.assertEquals(0, comprador.getAsientosElegidos().size());
    }

    /**
     * Prueba unitaria para el método numAsientosElegidos().
     */
    @Test
    void testNumAsientosElegidos() {
        comprador.addAsientosElegido(asiento1);
        comprador.addAsientosElegido(asiento2);

        comprador.numAsientosElegidos();

        Assertions.assertEquals(1, comprador.getNumAsientosNormalesElegidos());
        Assertions.assertEquals(0, comprador.getNumAsientosPremiumElegidos());
        Assertions.assertEquals(1, comprador.getNumAsientosVIPElegidos());
    }

    /**
     * Prueba unitaria para el método resetNumAsientosElegidos().
     */
    @Test
    void testResetNumAsientosElegidos() {
        comprador.addAsientosElegido(asiento1);
        comprador.addAsientosElegido(asiento2);

        comprador.numAsientosElegidos();
        comprador.resetNumAsientosElegidos();

        Assertions.assertEquals(0, comprador.getNumAsientosNormalesElegidos());
        Assertions.assertEquals(0, comprador.getNumAsientosPremiumElegidos());
        Assertions.assertEquals(0, comprador.getNumAsientosVIPElegidos());
    }
}