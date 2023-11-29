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
     * @param opcion la opción elegida
     * @return el horario de salida y llegada
     */
    public String Horario(int opcion){
        String horario;

        switch (opcion) {
            case 1:
                horario = "Salida: 10:00 hrs. - Llegada: 12:00 hrs.";
                break;
            case 2:
                horario = "Salida: 11:00 hrs. - Llegada: 12:30 hrs.";
                break;
                case 3:
                horario = "Salida: 13:00 hrs. - Llegada: 14:40 hrs.";
                break;
            case 4:
                horario = "Salida: 14:30 hrs. - Llegada: 16:10 hrs.";
                break;
            case 5:
                horario = "Salida: 16:00 hrs. - Llegada: 17:30 hrs.";
                break;
            case 6:
                horario = "Salida: 17:30 hrs. - Llegada: 19:40 hrs.";
                break;
            case 7:
                horario = "Salida: 19:00 hrs. - Llegada: 21:00 hrs.";
                break;
            default:
                horario = "Horario no disponible";
                break;
        }
        return horario;
    }
}