/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command;

/**
 *
 * @author Nicole
 */
public class RadioInterna implements IReceiver{
    
    private int volumen = 10;

    @Override
    public void subir() {
        if(volumen < 50){
            volumen++;
        }
        System.out.println("El volumen de la radio subió a nivel: "+volumen);
    }

    @Override
    public void bajar() {
        if(volumen>0){
            volumen--;
        }
        System.out.println("El volumen de la radio bajó a nivel: "+volumen);
    }

    
}
