package Proyecto;

/**
 * La clase Horarios proporciona métodos para obtener los horarios de salida y llegada de un viaje.
 */
public class Horarios {

    /**
     * Constructor de la clase Horarios.
     */
    public Horarios() {
    }

    /**
     * Devuelve el horario de salida y llegada correspondiente a la opción seleccionada.
     *
     * @param opcion la opción seleccionada
     * @return el horario de salida y llegada en formato de cadena de texto
     */
    public String Horario(int opcion){
        String horario;

        switch (opcion) {
            case 1:
                horario = "Salida: 13:00 - Llegada: 15:00";
                break;
            case 2:
                horario = "Salida: 15:00 - Llegada: 17:00";
                break;
            case 3:
                horario = "Salida: 17:00 - Llegada: 19:00";
                break;
            default:
                horario = "Horario no disponible";
                break;
        }
        return horario;
    }
}