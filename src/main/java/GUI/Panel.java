package GUI;

import Proyecto.*;

import java.awt.*;
import javax.swing.JPanel;

/**
 * El Panel es una clase que interactúa con la ventana del expendedor.
 */
public class Panel extends JPanel{
    private PanelRecorrido pr;
    private SelectorBus bus;
    private BusDisponible busDisponible;

    /**
     * Crea un nuevo Panel con el tamaño especificado, el comprador y los buses disponibles.
     * @param Tamano el tamaño del panel
     * @param comprador el comprador asociado al panel
     * @param busDisponible los buses disponibles
     */
    public Panel(int Tamano, Comprador comprador, BusDisponible busDisponible){
        super();
        setLayout(null);
        setBounds(0, 0, 4*Tamano, 3*Tamano);
        this.setBackground(Color.white);

        this.bus = new SelectorBus(busDisponible, comprador);
        pr = new PanelRecorrido(comprador, busDisponible, bus);
        this.busDisponible = busDisponible;
        add(pr);
        add(bus);

        this.setBounds(0,0,700,900);
        pr.setBounds(0,0,700,50);
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