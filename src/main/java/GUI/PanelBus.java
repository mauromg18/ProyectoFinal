package GUI;
import Proyecto.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El PanelBus es una clase que representa el panel de visualización y selección de asientos en un bus específico.
 */
public class PanelBus extends JPanel {
    private AsientosPanel asientos1;
    private AsientosPanel asientos2;
    private JButton confirmar;

    /**
     * Crea un nuevo PanelAsientosBus con el comprador, los buses disponibles y el bus elegido especificados.
     * @param pasajero el comprador asociado al panel
     * @param buses los buses disponibles
     * @param busSeleccionado el bus seleccionado
     */
    public PanelBus(Pasajero pasajero, BusDisponible buses, Bus busSeleccionado) {
        setLayout(null);
        setBackground(Color.white);
        asientos1 = new AsientosPanel(0, busSeleccionado, pasajero);
        asientos2 = new AsientosPanel(12, busSeleccionado, pasajero);

        asientos1.setBounds(0, 0, 100, 370);
        add(asientos1);

        asientos2.setBounds(200, 0, 100, 370);
        add(asientos2);

        confirmar = new JButton("Confirmar");
        add(confirmar);
        confirmar.setBounds(100, 380, 100, 40);

        confirmar.addActionListener(new ConfirmarListener(pasajero, buses, busSeleccionado));
    }

    /**
     * El ConfirmarListener es una clase interna que implementa ActionListener para manejar el evento de confirmación de reserva.
     */
    private class ConfirmarListener implements ActionListener {
        private Pasajero pasajero;
        private BusDisponible buses;
        private Bus busSeleccionado;

        /**
         * Crea un nuevo ConfirmarListener con el comprador, los buses disponibles y el bus elegido asociados.
         * @param pasajero el comprador asociado al panel
         * @param buses los buses disponibles
         * @param busSeleccionado el bus seleccionado
         */
        public ConfirmarListener(Pasajero pasajero, BusDisponible buses, Bus busSeleccionado) {
            this.pasajero = pasajero;
            this.buses = buses;
            this.busSeleccionado = busSeleccionado;
        }

        /**
         * Maneja el evento de clic en el botón de confirmación.
         * @param e el evento de acción
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            pasajero.numAsientosSeleccionado();
            String mensaje = "Usted va a reservar " + pasajero.getAsientosSeleccionado().size() + " asientos en nuestro bus "+ busSeleccionado.tipo() +" con origen: " +
                    busSeleccionado.getOrigen() + " y destino: " + busSeleccionado.getDestino() + "\nProgramado con "+ busSeleccionado.getHorario() + "\nAsiento normal: $" +
                    busSeleccionado.precioAsientoSemiCama() + " x " + pasajero.getNumAsientosSemiCama() + " = $" + busSeleccionado.precioAsientoSemiCama() * pasajero.getNumAsientosSemiCama() +
                    "\nAsiento Premium: $" + busSeleccionado.precioAsientoSalonCama() + " x " + pasajero.getNumAsientosSalonCama() + " = $" +
                    busSeleccionado.precioAsientoSalonCama() * pasajero.getNumAsientosSalonCama() + "\nAsiento VIP: $" + busSeleccionado.precioAsientoSalonVip() + " x " +
                    pasajero.getNumAsientosSalonVip() + " = $" + busSeleccionado.precioAsientoSalonVip() * pasajero.getNumAsientosSalonVip() + "\nTOTAL: $" +
                    ((busSeleccionado.precioAsientoSemiCama() * pasajero.getNumAsientosSemiCama()) + (busSeleccionado.precioAsientoSalonCama() * pasajero.getNumAsientosSalonCama()) + (busSeleccionado.precioAsientoSalonVip() * pasajero.getNumAsientosSalonVip()));
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    mensaje,
                    "Confirmar reserva",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Pagar", "Cancelar"},
                    "Pagar"
            );

            if (opcion == JOptionPane.YES_OPTION) {
                for (int i = 0; i < pasajero.getAsientosSeleccionado().size(); i++) {
                    pasajero.getAsientosSeleccionado(i).cambiarEstado();
                }
                //Resetear despues de terminar la compra
                JOptionPane.showMessageDialog(
                        null,
                        "Pago realizado con éxito",
                        "Pago exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (opcion == JOptionPane.NO_OPTION) {
                pasajero.resetNumAsientosSeleccionado();
                //agregar reseteo de variables
                System.out.println("Cancelar pago");
            }
        }
    }
}