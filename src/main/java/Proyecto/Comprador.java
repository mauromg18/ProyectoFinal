package Proyecto;

import java.util.ArrayList;

/**
 * La clase Comprador representa un comprador de boletos de autobús.
 */
public class Comprador {

    private String horarioElegido;
    private Recorridos destinoElegido;
    private Recorridos origenElegido;
    private Bus busElegido;
    private Asiento asientoElegido;
    private ArrayList<Asiento> asientosElegido;
    private int numAsientosNormalesElegidos;
    private int numAsientosPremiumElegidos;
    private int numAsientosVIPElegidos;

    /**
     * Crea una instancia de la clase Comprador.
     * Inicializa las listas de asientos elegidos y los contadores de asientos.
     */
    public Comprador(){
        asientosElegido = new ArrayList<>();
        numAsientosNormalesElegidos = 0;
        numAsientosPremiumElegidos = 0;
        numAsientosVIPElegidos = 0;
    }

    /**
     * Establece el origen elegido por el comprador.
     * @param origenElegido el origen elegido
     */
    public void setOrigen(Recorridos origenElegido){
        this.origenElegido = origenElegido;
    }

    /**
     * Obtiene el origen elegido por el comprador.
     * @return el origen elegido
     */
    public Recorridos getOrigenElegido(){
        return origenElegido;
    }

    /**
     * Establece el destino elegido por el comprador.
     * @param destinoElegido el destino elegido
     */
    public void setDestino(Recorridos destinoElegido){
        this.destinoElegido = destinoElegido;
    }

    /**
     * Obtiene el destino elegido por el comprador.
     * @return el destino elegido
     */
    public Recorridos getDestinoElegido(){
        return destinoElegido;
    }

    /**
     * Establece el horario elegido por el comprador.
     * @param horarioElegido el horario elegido
     */
    public void setHorario(String horarioElegido){
        this.horarioElegido = horarioElegido;
    }

    /**
     * Obtiene el horario elegido por el comprador.
     * @return el horario elegido
     */
    public String getHorarioElegido(){
        return horarioElegido;
    }

    /**
     * Establece el autobús elegido por el comprador.
     * @param busElegido el autobús elegido
     */
    public void setBus(Bus busElegido){
        this.busElegido = busElegido;
    }

    /**
     * Obtiene el autobús elegido por el comprador.
     * @return el autobús elegido
     */
    public Bus getBusElegido(){
        return busElegido;
    }

    /**
     * Establece el asiento elegido por el comprador.
     * @param asientoElegido el asiento elegido
     */
    public void setAsiento(Asiento asientoElegido){
        this.asientoElegido = asientoElegido;
    }

    /**
     * Obtiene el asiento elegido por el comprador.
     * @return el asiento elegido
     */
    public Asiento getAsientoElegido(){
        return asientoElegido;
    }

    /**
     * Agrega un asiento a la lista de asientos elegidos por el comprador.
     * @param asiento el asiento a agregar
     */
    public void addAsientosElegido(Asiento asiento){
        if(asiento != null) {
            asientosElegido.add(asiento);
        }
    }

    /**
     * Remueve un asiento de la lista de asientos elegidos por el comprador.
     * @param asiento el asiento a remover
     */
    public void removeAsientosElegido(Asiento asiento){
        if(asiento != null) {
            asientosElegido.remove(asiento);
        }
    }

    /**
     * Obtiene un asiento de la lista de asientos elegidos por su índice.
     * @param indice el índice del asiento
     * @return el asiento en el índice dado, o null si no existe
     */
    public Asiento getAsientosElegido(int indice) {
        if (indice >= 0 && indice < asientosElegido.size()) {
            return asientosElegido.get(indice);
        } else {
            return null;
        }
    }

    /**
     * Obtiene la lista de asientos elegidos por el comprador.
     * @return la lista de asientos elegidos
     */
    public ArrayList<Asiento> getAsientosElegidos(){
        return asientosElegido;
    }

    /**
     * Calcula el número de asientos elegidos en cada tipo (normal, premium, VIP)
     * y actualiza los contadores correspondientes.
     */
    public void numAsientosElegidos(){
        for (int i = 0; i < getAsientosElegidos().size(); i++) {
            if (asientosElegido.get(i).getTipo() == "Asiento normal"){
                numAsientosNormalesElegidos++;
            } else if (asientosElegido.get(i).getTipo() == "Asiento premium") {
                numAsientosPremiumElegidos++;
            } else if (asientosElegido.get(i).getTipo() == "Asiento VIP") {
                numAsientosVIPElegidos++;
            }
        }
    }

    /**
     * Reinicia los contadores de asientos elegidos a cero.
     */
    public void resetNumAsientosElegidos(){
        numAsientosNormalesElegidos = 0;
        numAsientosPremiumElegidos = 0;
        numAsientosVIPElegidos = 0;
    }

    /**
     * Obtiene el número de asientos normales elegidos por el comprador.
     * @return el número de asientos normales elegidos
     */
    public int getNumAsientosNormalesElegidos(){
        return numAsientosNormalesElegidos;
    }

    /**
     * Obtiene el número de asientos premium elegidos por el comprador.
     * @return el número de asientos premium elegidos
     */
    public int getNumAsientosPremiumElegidos(){
        return numAsientosPremiumElegidos;
    }

    /**
     * Obtiene el número de asientos VIP elegidos por el comprador.
     * @return el número de asientos VIP elegidos
     */
    public int getNumAsientosVIPElegidos(){
        return numAsientosVIPElegidos;
    }

}