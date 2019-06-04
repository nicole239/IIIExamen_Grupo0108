/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

import java.util.Queue;

/**
 *
 * @author Nicole
 */
public class SimuladorColaEventos extends SimuladorGenerico{
    
    private Queue<Evento> colaEventos;

    @Override
    public Estado cambiar(Estado viejoEstado, Evento evento) {
        Estado nuevoEstado = new Estado(evento.getNombre(),viejoEstado.getTiempo() + 1);
        return nuevoEstado;
    }

    @Override
    public void actuar(Estado nuevoEstado, Estado viejoEstado) {
        System.out.println("Se cambia del estado "+ viejoEstado.getNombre() + " al estado "+nuevoEstado.getNombre());
    }

    @Override
    public void simular() {
        viejoEstado = new Estado("Inicio",0.0d);

        tiempoSimulado = colaEventos.peek().getTiempo();
        do{
            eventoActual = colaEventos.poll();
            nuevoEstado = cambiar(viejoEstado, eventoActual);
            actuar(nuevoEstado, viejoEstado);
            viejoEstado = nuevoEstado;
        }while(!colaEventos.isEmpty());

    }
    
    public SimuladorColaEventos(Queue<Evento> cola){
        this.colaEventos = cola;
    }
    
    
}
