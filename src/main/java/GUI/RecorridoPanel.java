package GUI;
import Proyecto.*;
import Proyecto.Pasajero;
import Proyecto.Recorrido;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El PanelRecorrido es una clase que representa el panel de selección de recorrido y horario.
 */
public class RecorridoPanel extends JPanel implements ActionListener {
    private JComboBox<Recorrido> origenComboBox;
    private JComboBox<Recorrido> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JButton buscar;
    private Pasajero pasajero;
    private BusDisponible busDisponible;
    private SeleccionBus seleccionBus;

    /**
     * Crea un nuevo PanelRecorrido con el comprador, los buses disponibles y el selector de bus asociados.
     * @param pasajero el comprador asociado al panel
     * @param busDisponible los buses disponibles
     * @param seleccionBus el selector de bus asociado
     */
    public RecorridoPanel(Pasajero pasajero, BusDisponible busDisponible, SeleccionBus seleccionBus) {
        this.pasajero = pasajero;
        this.busDisponible = busDisponible;
        this.seleccionBus = seleccionBus;

        JLabel origenLabel = new JLabel("Origen:");
        add(origenLabel);

        origenComboBox = new JComboBox<>(Recorrido.values());
        origenComboBox.setSelectedIndex(-1);
        origenComboBox.addActionListener(this);
        add(origenComboBox);

        JLabel destinoLabel = new JLabel("Destino:");
        add(destinoLabel);
        destinoComboBox = new JComboBox<>(Recorrido.values());
        destinoComboBox.setSelectedIndex(-1);
        destinoComboBox.addActionListener(this);
        add(destinoComboBox);

        JLabel horario = new JLabel("Horario: ");
        add(horario);

        horarioComboBox = new JComboBox<>();
        horarioComboBox.addItem("Salida: 13:00 - Llegada: 15:00");
        horarioComboBox.addItem("Salida: 15:00 - Llegada: 17:00");
        horarioComboBox.addItem("Salida: 17:00 - Llegada: 19:00");
        add(horarioComboBox);

        buscar = new JButton("Buscar");
        horarioComboBox.setSelectedIndex(-1);
        buscar.addActionListener(this);
        add(buscar);
    }

    /**
     * Maneja el evento de acción.
     * @param e el evento de acción
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == origenComboBox) {
            pasajero.setOrigen((Recorrido) origenComboBox.getSelectedItem());
            pasajero.setDestino((Recorrido) destinoComboBox.getSelectedItem());

            Recorrido origenSeleccionado = (Recorrido) origenComboBox.getSelectedItem();
            Recorrido destinoSeleccionado = (Recorrido) destinoComboBox.getSelectedItem();

            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                destinoComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == destinoComboBox) {
            pasajero.setDestino((Recorrido) destinoComboBox.getSelectedItem());

            Recorrido origenSeleccionado = (Recorrido) origenComboBox.getSelectedItem();
            Recorrido destinoSeleccionado = (Recorrido) destinoComboBox.getSelectedItem();
            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                origenComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == buscar) {
            pasajero.setOrigen((Recorrido) origenComboBox.getSelectedItem());
            pasajero.setDestino((Recorrido) destinoComboBox.getSelectedItem());
            // AÑADIR EXCEPCIONES EN CASO DE NULL
            pasajero.setHorario((String) horarioComboBox.getSelectedItem());

            Recorrido origenSeleccionado = (Recorrido) origenComboBox.getSelectedItem();
            Recorrido destinoSeleccionado = (Recorrido) destinoComboBox.getSelectedItem();
            System.out.println("Origen: " +pasajero.getOrigenSeleccionado());
            System.out.println("Destino: " + pasajero.getDestinoSeleccionado());
            System.out.println("Horario: " + pasajero.getHorarioSeleccionado());

            seleccionBus.actualizarBuses(busDisponible); // Actualizar el contenido del panel SelectorBus
        }
    }
}