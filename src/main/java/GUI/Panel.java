package GUI;
import Proyecto.*;

import java.awt.*;
import javax.swing.JPanel;

/**
 * El Panel es una clase que interactúa con la ventana.
 */
public class Panel extends JPanel{
    private RecorridoPanel rp;
    private SeleccionBus bus;
    private BusDisponible busDisponible;

    /**
     * Crea un nuevo Panel con el tamaño especificado, el pasajero y los buses disponibles.
     * @param Tamano el tamaño del panel
     * @param pasajero el pasajero asociado al panel
     * @param busDisponible los buses disponibles
     */
    public Panel(int Tamano, Pasajero pasajero, BusDisponible busDisponible){
        super();
        setLayout(null);
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.blue);

        this.bus = new SeleccionBus(busDisponible, pasajero);
        rp = new RecorridoPanel(pasajero, busDisponible, bus);
        this.busDisponible = busDisponible;
        add(rp);
        add(bus);

        this.setBounds(0,0,700,900);
        rp.setBounds(0,0,700,50);
        bus.setBounds(0,50,700,900);
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