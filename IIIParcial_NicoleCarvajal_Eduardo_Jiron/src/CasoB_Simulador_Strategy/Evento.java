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
public class Evento {
    
    private String  nombre;
    private double tiempo;
    
    public Evento(String nombre, double tiempo){
        this.nombre  = nombre;
        this.tiempo = tiempo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Double getTiempo(){
        return tiempo;
    }
}
