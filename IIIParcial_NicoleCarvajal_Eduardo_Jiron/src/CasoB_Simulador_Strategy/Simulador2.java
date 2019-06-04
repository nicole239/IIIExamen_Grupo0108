/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

import java.util.ArrayList;

/**
 *
 * @author Nicole
 */
public class Simulador2 extends SimuladorGenerico {
    
    ArrayList<Evento> eventos = new ArrayList<>();

    @Override
    public Estado cambiar(Estado viejoEstado, Evento evento) {
        Estado nuevoEstado = new Estado(evento.getNombre(),viejoEstado.getTiempo() + 2);
        return nuevoEstado;
    }

    @Override
    public void actuar(Estado nuevoEstado, Estado viejoEstado) {
        System.out.println("Se cambia del estado "+viejoEstado.getNombre() +" al estado "+nuevoEstado.getNombre() );
    }

    @Override
    public void simular() {
        viejoEstado = new Estado("Inicial",0.0d);
        for(Evento e : eventos){
            eventoActual = e;
            nuevoEstado = cambiar(viejoEstado, eventoActual);
            actuar(nuevoEstado, viejoEstado);
            viejoEstado = nuevoEstado;
        }
    }
    
    public Simulador2(ArrayList<Evento> eventos){
        this.eventos = eventos;
    }
    
}
