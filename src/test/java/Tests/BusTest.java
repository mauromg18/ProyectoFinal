package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Bus.
 */
public class BusTest {
    private Bus bus;

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        bus = new Bus() {
            @Override
            public void agregarAsientos() {
            }

            @Override
            public Recorrido getOrigen() {
                return null;
            }

            @Override
            public Recorrido getDestino() {
                return null;
            }

            @Override
            public String getHorario() {
                return null;
            }

            @Override
            public int tipo() {
                return 0;
            }

            @Override
            public int precioAsientoSemiCama() {
                return 0;
            }

            @Override
            public int precioAsientoSalonCama() {
                return 0;
            }

            @Override
            public int precioAsientoSalonVip() {
                return 0;
            }
        };
    }

    /**
     * Prueba para agregar un asiento al bus.
     */
    @Test
    public void testAddAsiento() {
        Asiento asiento = new SemiCama(100);
        bus.addAsiento(asiento);
        Assertions.assertEquals(asiento, bus.getAsiento(0));
    }

    /**
     * Prueba para obtener un asiento del bus con un índice dentro del rango válido.
     */
    @Test
    public void testGetAsiento_IndexInRange() {
        Asiento asiento = new SalonCama(200);
        bus.addAsiento(asiento);
        Asiento resultado = bus.getAsiento(0);
        Assertions.assertEquals(asiento, resultado);
    }

    /**
     * Prueba para obtener un asiento del bus con un índice fuera del rango válido.
     */
    @Test
    public void testGetAsiento_IndexOutOfRange() {
        Asiento resultado = bus.getAsiento(1);
        Assertions.assertNull(resultado);
    }
}