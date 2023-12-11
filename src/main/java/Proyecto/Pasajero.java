package Proyecto;

import java.util.ArrayList;

/**
 * La clase pasajero representa un comprador de boletos de bus.
 */
public class Pasajero {

    private String horarioSeleccionado;
    private Recorrido destinoSeleccionado;
    private Recorrido origenSeleccionado;
    private Bus busSeleccionado;
    private Asiento asientoSeleccionado;
    private ArrayList<Asiento> asientosSeleccionado;
    private int numAsientosSemiCama;
    private int numAsientosSalonCama;
    private int numAsientosSalonVip;

    /**
     * Crea una instancia de la clase pasajero.
     * Inicializa las listas de asientos seleccionados y los contadores de asientos.
     */
    public Pasajero(){
        asientosSeleccionado = new ArrayList<>();
        numAsientosSemiCama= 0;
        numAsientosSalonCama = 0;
        numAsientosSalonVip = 0;
    }

    /**
     * Establece el origen seleccionado por el comprador.
     * @param origenSeleccionado el origen seleccionado
     */
    public void setOrigen(Recorrido origenSeleccionado){
        this.origenSeleccionado= origenSeleccionado;
    }

    /**
     * Obtiene el origen Seleccionado por el comprador.
     * @return el origen Seleccionado
     */
    public Recorrido getOrigenSeleccionado(){
        return origenSeleccionado;
    }

    /**
     * Establece el destino Seleccionado por el comprador.
     * @param destinoSeleccionado el destino Seleccionado
     */
    public void setDestino(Recorrido destinoSeleccionado){
        this.destinoSeleccionado = destinoSeleccionado;
    }

    /**
     * Obtiene el destino Seleccionado por el comprador.
     * @return el destino Seleccionado
     */
    public Recorrido getDestinoSeleccionado(){
        return destinoSeleccionado;
    }

    /**
     * Establece el horario Seleccionado por el comprador.
     * @param horarioSeleccionado el horario Seleccionado
     */
    public void setHorario(String horarioSeleccionado){
        this.horarioSeleccionado = horarioSeleccionado;
    }

    /**
     * Obtiene el horario Seleccionado por el comprador.
     * @return el horario Seleccionado
     */
    public String getHorarioSeleccionado(){
        return horarioSeleccionado;
    }

    /**
     * Establece el bus Seleccionado por el comprador.
     * @param busSeleccionado el bus Seleccionado
     */
    public void setBus(Bus busSeleccionado){
        this.busSeleccionado = busSeleccionado;
    }

    /**
     * Obtiene el bus Seleccionado por el comprador.
     * @return el bus Seleccionado
     */
    public Bus getBusSeleccionado(){
        return busSeleccionado;
    }

    /**
     * Establece el asiento Seleccionado por el comprador.
     * @param asientoSeleccionado el asiento Seleccionado
     */
    public void setAsiento(Asiento asientoSeleccionado){
        this.asientoSeleccionado = asientoSeleccionado;
    }

    /**
     * Obtiene el asiento Seleccionado por el comprador.
     * @return el asiento Seleccionado
     */
    public Asiento getAsientoSeleccionado(){
        return asientoSeleccionado;
    }

    /**
     * Agrega un asiento a la lista de asientos Seleccionado por el comprador.
     * @param asiento el asiento a agregar
     */
    public void addAsientosSeleccionado(Asiento asiento){
        if(asiento != null) {
            asientosSeleccionado.add(asiento);
        }
    }

    /**
     * Remueve un asiento de la lista de asientos Seleccionado por el comprador.
     * @param asiento el asiento a remover
     */
    public void removeAsientosSeleccionado(Asiento asiento){
        if(asiento != null) {
            asientosSeleccionado.remove(asiento);
        }
    }

    /**
     * Obtiene un asiento de la lista de asientos Seleccionado por su índice.
     * @param indice el índice del asiento
     * @return el asiento en el índice dado, o null si no existe
     */
    public Asiento getAsientosSeleccionado(int indice) {
        if (indice >= 0 && indice < asientosSeleccionado.size()) {
            return asientosSeleccionado.get(indice);
        } else {
            return null;
        }
    }

    /**
     * Obtiene la lista de asientos Seleccionado por el comprador.
     * @return la lista de asientos Seleccionado
     */
    public ArrayList<Asiento> getAsientosSeleccionado(){
        return asientosSeleccionado;
    }

    /**
     * Calcula el número de asientos Seleccionado en cada tipo
     * y actualiza los contadores correspondientes.
     */
    public void numAsientosSeleccionado(){
        for (int i = 0; i < getAsientosSeleccionado().size(); i++) {
            if ("Asiento semi cama".equals(asientosSeleccionado.get(i).getTipo())) {
                numAsientosSemiCama++;
            } else if ("Asiento salon cama".equals(asientosSeleccionado.get(i).getTipo())) {
                numAsientosSalonCama++;
            } else if ("Asiento salon vip".equals(asientosSeleccionado.get(i).getTipo())) {
                numAsientosSalonVip++;
            }
        }
    }

    /**
     * Reinicia los contadores de asientos Seleccionados a cero.
     */
    public void resetNumAsientosSeleccionado(){
        numAsientosSemiCama = 0;
        numAsientosSalonCama = 0;
        numAsientosSalonVip = 0;
    }

    /**
     * Obtiene el número de asientos semi cama Seleccionado por el comprador.
     * @return el número de asientos semi cama Seleccionados
     */
    public int getNumAsientosSemiCama(){
        return numAsientosSemiCama;
    }

    /**
     * Obtiene el número de asientos salon cama Seleccionados por el comprador.
     * @return el número de asientos salon cama Seleccionados
     */
    public int getNumAsientosSalonCama(){
        return numAsientosSalonCama;
    }

    /**
     * Obtiene el número de asientos salon vip Seleccionados por el comprador.
     * @return el número de asientos salon vip Seleccionados
     */
    public int getNumAsientosSalonVip(){
        return numAsientosSalonVip;
    }

}