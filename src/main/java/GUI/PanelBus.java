package GUI;
import code.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * El PanelAsientosBus es una clase que representa el panel de visualización y selección de asientos en un bus específico.
 */
public class PanelAsientosBus extends JPanel {
    private PanelAsientos asientos1;
    private PanelAsientos asientos2;
    private JButton confirmar;

    /**
     * Crea un nuevo PanelAsientosBus con el comprador, los buses disponibles y el bus elegido especificados.
     * @param comprador el comprador asociado al panel
     * @param buses los buses disponibles
     * @param busElegido el bus seleccionado
     */
    public PanelAsientosBus(Comprador comprador, BusDisponible buses, Bus busElegido) {
        setLayout(null);
        setBackground(Color.white);
        asientos1 = new PanelAsientos(0, busElegido, comprador);
        asientos2 = new PanelAsientos(12, busElegido, comprador);

        asientos1.setBounds(0, 0, 100, 370);
        add(asientos1);

        asientos2.setBounds(200, 0, 100, 370);
        add(asientos2);

        confirmar = new JButton("Confirmar");
        add(confirmar);
        confirmar.setBounds(100, 380, 100, 40);

        confirmar.addActionListener(new ConfirmarListener(comprador, buses, busElegido));
    }

    /**
     * El ConfirmarListener es una clase interna que implementa ActionListener para manejar el evento de confirmación de reserva.
     */
    private class ConfirmarListener implements ActionListener {
        private Comprador comprador;
        private BusDisponible buses;
        private Bus busElegido;

        /**
         * Crea un nuevo ConfirmarListener con el comprador, los buses disponibles y el bus elegido asociados.
         * @param comprador el comprador asociado al panel
         * @param buses los buses disponibles
         * @param busElegido el bus seleccionado
         */
        public ConfirmarListener(Comprador comprador, BusDisponible buses, Bus busElegido) {
            this.comprador = comprador;
            this.buses = buses;
            this.busElegido = busElegido;
        }

        /**
         * Maneja el evento de clic en el botón de confirmación.
         * @param e el evento de acción
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            comprador.numAsientosElegidos();
            String mensaje = "Usted va a reservar " + comprador.getAsientosElegidos().size() + " asientos en nuestro bus "+ busElegido.tipo() +" con origen: " +
                    busElegido.getOrigen() + " y destino: " + busElegido.getDestino() + "\nProgramado con "+ busElegido.getHorario() + "\nAsiento normal: $" +
                    busElegido.precioAsientoNormal() + " x " + comprador.getNumAsientosNormalesElegidos() + " = $" + busElegido.precioAsientoNormal() * comprador.getNumAsientosNormalesElegidos() +
                    "\nAsiento Premium: $" + busElegido.precioAsientoPremium() + " x " + comprador.getNumAsientosPremiumElegidos() + " = $" +
                    busElegido.precioAsientoPremium() * comprador.getNumAsientosPremiumElegidos() + "\nAsiento VIP: $" + busElegido.precioAsientoVIP() + " x " +
                    comprador.getNumAsientosVIPElegidos() + " = $" + busElegido.precioAsientoVIP() * comprador.getNumAsientosVIPElegidos() + "\nTOTAL: $" +
                    ((busElegido.precioAsientoNormal() * comprador.getNumAsientosNormalesElegidos()) + (busElegido.precioAsientoPremium() * comprador.getNumAsientosPremiumElegidos()) + (busElegido.precioAsientoVIP() * comprador.getNumAsientosVIPElegidos()));  //Mucho texto
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
                for (int i = 0; i < comprador.getAsientosElegidos().size(); i++) {
                    comprador.getAsientosElegido(i).cambiarStatus();
                }
                //Resetear despues de terminar la compra
                JOptionPane.showMessageDialog(
                        null,
                        "Pago realizado con éxito",
                        "Pago exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (opcion == JOptionPane.NO_OPTION) {
                comprador.resetNumAsientosElegidos();
                //agregar reseteo de variables
                System.out.println("Cancelar pago");
            }
        }
    }
}