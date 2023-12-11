package GUI;
import Proyecto.Bus;
import Proyecto.BusDisponible;
import Proyecto.Pasajero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El SelectorBus es una clase que representa el panel de selección de bus.
 */
public class SeleccionBus extends JPanel implements ActionListener {
    private JComboBox<String> comboBox;
    private JButton button;
    private BusDisponible busDisponible;
    private Pasajero pasajero;
    private Bus busSeleccionado;

    /**
     * Crea un nuevo SelectorBus con los buses disponibles y el comprador asociados.
     * @param busDisponible los buses disponibles
     * @param Pasajero el comprador asociado
     */
    public SeleccionBus(BusDisponible busDisponible, Pasajero pasajero) {
        this.busDisponible = busDisponible;
        this.pasajero = pasajero;
        busDisponible.filtrarBuses(pasajero.getOrigenSeleccionado(), pasajero.getDestinoSeleccionado(), pasajero.getHorarioSeleccionado());

        String[] busNombre = new String[busDisponible.getBusesDisponibles().size()];
        for (int i = 0; i < busDisponible.getBusesDisponibles().size(); i++) {
            busNombre[i] = "Bus " + (i + 1);
        }

        comboBox = new JComboBox<>(busNombre);
        add(comboBox);

        button = new JButton("Seleccionar");
        button.addActionListener(this);
        add(button);
    }

    /**
     * Maneja el evento de acción.
     * @param e el evento de acción
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int selectedIndex = comboBox.getSelectedIndex();
            if (selectedIndex >= 0 && selectedIndex < busDisponible.getBusesDisponibles().size()) {
                // Hacer algo con el bus seleccionado
                busSeleccionado = busDisponible.getBusDisponible(selectedIndex);
                System.out.println("Bus seleccionado: " + busSeleccionado);

                if(busSeleccionado != null){
                    this.setLayout(null);
                    PanelBus asientosBus = new PanelBus(pasajero, busDisponible, busSeleccionado);
                    this.add(asientosBus);
                    asientosBus.setBounds(0,100,700,900);
                    revalidate();
                    repaint();
                }

            } else {
                System.out.println("No se ha seleccionado un bus válido.");
            }
        }

    }

    /**
     * Actualiza la lista de buses disponibles.
     * @param busDisponible los buses disponibles
     */
    public void actualizarBuses(BusDisponible busDisponible) {
        busDisponible.filtrarBuses(pasajero.getOrigenSeleccionado(), pasajero.getDestinoSeleccionado(), pasajero.getHorarioSeleccionado());
        this.busDisponible = busDisponible;
        String[] busNames = new String[busDisponible.getBusesDisponibles().size()];
        for (int i = 0; i < busDisponible.getBusesDisponibles().size(); i++) {
            busNames[i] = "Bus " + (i + 1);
        }
        comboBox.setModel(new DefaultComboBoxModel<>(busNames));
        comboBox.setSelectedIndex(-1);
    }
}