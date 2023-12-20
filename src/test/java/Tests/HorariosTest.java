package Tests;
import Proyecto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Horarios.
 */
class HorariosTest {

    private Horarios horarios = new Horarios();

    /**
     * Prueba unitaria para el método Horario().
     */
    @Test
    void testHorario() {
        String horario1 = horarios.Horario(1);
        Assertions.assertEquals("Salida: 11:00 - Llegada: 14:00", horario1);

        String horario2 = horarios.Horario(2);
        Assertions.assertEquals("Salida: 15:00 - Llegada: 18:00", horario2);

        String horario3 = horarios.Horario(3);
        Assertions.assertEquals("Salida: 18:00 - Llegada: 21:00", horario3);

        String horarioInvalido = horarios.Horario(5);
        Assertions.assertEquals("Horario no disponible", horarioInvalido);
    }
}