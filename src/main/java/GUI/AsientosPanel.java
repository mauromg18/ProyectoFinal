package GUI;
import Proyecto.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El AsientosPanel es una clase que representa el panel de visualización y selección de asientos en un bus.
 */
public class AsientosPanel extends JPanel {
    private JButton[] botones;
    private Bus busSeleccionado;
    private Pasajero pasajero;

    /**
     * Crea un nuevo AsientosPanel con el número de asientos especificado, el bus seleccionado y el pasajero asociado.
     * @param n el número de asientos a mostrar
     * @param busSeleccionado el bus seleccionado
     * @param pasajero el pasajero asociado al panel
     */
    public AsientosPanel(int n, Bus busSeleccionado, Pasajero pasajero){
        this.busSeleccionado = busSeleccionado;
        this.pasajero = pasajero;

        setLayout(new GridLayout(6, 2));
        botones = new JButton[24];
        if(busSeleccionado != null) {
            for (int i = n; i < n + 12; i++) {
                if (busSeleccionado.getAsiento(i).getTipo() == "Asiento SemiCama") {
                    if(busSeleccionado.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoOcupado.png"));
                        botones[i].setEnabled(false);
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoSemiCama.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                } else if (busSeleccionado.getAsiento(i).getTipo() == "Asiento SalonCama") {
                    if(busSeleccionado.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoOcupado.png"));
                        botones[i].setEnabled(false);
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/SalonCama.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                } else if (busSeleccionado.getAsiento(i).getTipo() == "Asiento SalonVip") {
                    if(busSeleccionado.getAsiento(i).getStatus()) {
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoOcupado.png"));
                        botones[i].setEnabled(false);
                    }else{
                        botones[i] = new JButton(new ImageIcon("Proyecto/src/main/java/imagenes/SalonVip.png"));
                    }
                    botones[i].setBackground(Color.white);
                    botones[i].addActionListener(new BotonListener(i));
                    add(botones[i]);
                }
            }
        }
    }

    /**
     * El BotonListener es una clase interna que implementa ActionListener para manejar los eventos de los botones de asiento.
     */
    class BotonListener implements ActionListener {
        private int botonIndex;
        private boolean ocupado;

        /**
         * Crea un nuevo BotonListener con el índice del botón asociado.
         * @param index el índice del botón
         */
        public BotonListener(int index) {
            botonIndex = index;
            busSeleccionado.getAsiento(botonIndex).cambiarEstado();
            ocupado = busSeleccionado.getAsiento(botonIndex).getStatus();
        }

        /**
         * Maneja el evento de clic en el botón de asiento.
         * @param e el evento de acción
         */
        public void actionPerformed(ActionEvent e) {
            ocupado = !ocupado;
            if (ocupado) {
                if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento SemiCama")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoSemiCama.png"));
                    pasajero.removeAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                } else if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento SalonCama")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/SalonCama.png"));
                    pasajero.removeAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                } else if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento VIP")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/SalonVip.png"));
                    pasajero.removeAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                }
            } else {
                if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento SemiCama")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/AsientoSemiCama.png"));
                    pasajero.addAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                } else if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento premium")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/SalonCama.png"));
                    pasajero.addAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                } else if (busSeleccionado.getAsiento(botonIndex).getTipo().equals("Asiento VIP")) {
                    botones[botonIndex].setIcon(new ImageIcon("Proyecto/src/main/java/imagenes/SalonVip.png"));
                    pasajero.addAsientosSeleccionado(busSeleccionado.getAsiento(botonIndex));
                }
            }
        }
    }

    /**
     * Sobrescribe el método paint para personalizar la apariencia del panel.
     * @param g el objeto Graphics para dibujar en el panel
     */
    public void paint(Graphics g){
        super.paint(g);
        // Personalizar la apariencia del panel
    }
}