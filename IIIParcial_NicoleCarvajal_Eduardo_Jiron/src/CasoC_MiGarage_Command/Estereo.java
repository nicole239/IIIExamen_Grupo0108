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
public class Estereo implements IReceiver {
    
    private int volumen = 20;
    
    @Override
    public void subir() {
        if(volumen < 100)
            volumen++;
        System.out.println("Se subió el volumen a: "+volumen);
    }

    @Override
    public void bajar() {
        if(volumen > 0)
            volumen--;
        System.out.println("Se bajó el volumen a: "+volumen);
    }

}
