package GUI;

import Proyecto.*;
import Proyecto.Comprador;
import Proyecto.Recorridos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El PanelRecorrido es una clase que representa el panel de selección de recorrido y horario.
 */
public class PanelRecorrido extends JPanel implements ActionListener {
    private JComboBox<Recorridos> origenComboBox;
    private JComboBox<Recorridos> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JButton buscar;
    private Comprador comprador;
    private BusDisponible busDisponible;
    private SelectorBus selectorBus;

    /**
     * Crea un nuevo PanelRecorrido con el comprador, los buses disponibles y el selector de bus asociados.
     * @param comprador el comprador asociado al panel
     * @param busDisponible los buses disponibles
     * @param selectorBus el selector de bus asociado
     */
    public PanelRecorrido(Comprador comprador, BusDisponible busDisponible, SelectorBus selectorBus) {
        this.comprador = comprador;
        this.busDisponible = busDisponible;
        this.selectorBus = selectorBus;

        JLabel origenLabel = new JLabel("Origen:");
        add(origenLabel);

        origenComboBox = new JComboBox<>(Recorridos.values());
        origenComboBox.setSelectedIndex(-1);
        origenComboBox.addActionListener(this);
        add(origenComboBox);

        JLabel destinoLabel = new JLabel("Destino:");
        add(destinoLabel);
        destinoComboBox = new JComboBox<>(Recorridos.values());
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
            comprador.setOrigen((Recorridos) origenComboBox.getSelectedItem());
            comprador.setDestino((Recorridos) destinoComboBox.getSelectedItem());

            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();

            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                destinoComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == destinoComboBox) {
            comprador.setDestino((Recorridos) destinoComboBox.getSelectedItem());

            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();
            if (origenSeleccionado != null && destinoSeleccionado != null && origenSeleccionado.equals(destinoSeleccionado)) {
                origenComboBox.setSelectedIndex(-1);
            }
        } else if (e.getSource() == buscar) {
            comprador.setOrigen((Recorridos) origenComboBox.getSelectedItem());
            comprador.setDestino((Recorridos) destinoComboBox.getSelectedItem());
            // AÑADIR EXCEPCIONES EN CASO DE NULL
            comprador.setHorario((String) horarioComboBox.getSelectedItem());

            Recorridos origenSeleccionado = (Recorridos) origenComboBox.getSelectedItem();
            Recorridos destinoSeleccionado = (Recorridos) destinoComboBox.getSelectedItem();
            System.out.println("Origen: " +comprador.getOrigenElegido());
            System.out.println("Destino: " + comprador.getDestinoElegido());
            System.out.println("Horario: " + comprador.getHorarioElegido());

            selectorBus.actualizarBuses(busDisponible); // Actualizar el contenido del panel SelectorBus
        }
    }
}