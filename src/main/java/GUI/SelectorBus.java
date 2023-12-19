package GUI;

import Proyecto.Bus;
import Proyecto.BusDisponible;
import Proyecto.Comprador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El SelectorBus es una clase que representa el panel de selección de bus.
 */
public class SelectorBus extends JPanel implements ActionListener {
    private JComboBox<String> comboBox;
    private JButton button;
    private BusDisponible busDisponible;
    private Comprador comprador;
    private Bus busElegido;

    /**
     * Crea un nuevo SelectorBus con los buses disponibles y el comprador asociados.
     * @param busDisponible los buses disponibles
     * @param comprador el comprador asociado
     */
    public SelectorBus(BusDisponible busDisponible, Comprador comprador) {
        this.busDisponible = busDisponible;
        this.comprador = comprador;
        busDisponible.filtrarBuses(comprador.getOrigenElegido(), comprador.getDestinoElegido(), comprador.getHorarioElegido());

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
                busElegido = busDisponible.getBusDisponible(selectedIndex);
                System.out.println("Bus seleccionado: " + busElegido);

                if(busElegido != null){
                    this.setLayout(null);
                    PanelAsientosBus asientosBus = new PanelAsientosBus(comprador, busDisponible, busElegido);
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
        busDisponible.filtrarBuses(comprador.getOrigenElegido(), comprador.getDestinoElegido(), comprador.getHorarioElegido());
        this.busDisponible = busDisponible;
        String[] busNames = new String[busDisponible.getBusesDisponibles().size()];
        for (int i = 0; i < busDisponible.getBusesDisponibles().size(); i++) {
            busNames[i] = "Bus " + (i + 1);
        }
        comboBox.setModel(new DefaultComboBoxModel<>(busNames));
        comboBox.setSelectedIndex(-1);
    }
}