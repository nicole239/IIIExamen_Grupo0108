/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

/**
 *
 * @author Nicole
 */
public abstract class SimuladorGenerico {
    protected Estado nuevoEstado;
    protected Estado viejoEstado;
    protected Evento eventoActual;
    protected double tiempoSimulado;
    
    public abstract Estado cambiar(Estado viejoEstado, Evento evento);
    public abstract void actuar(Estado nuevoEstado, Estado viejoEstado);
    public abstract void simular();
    
}
