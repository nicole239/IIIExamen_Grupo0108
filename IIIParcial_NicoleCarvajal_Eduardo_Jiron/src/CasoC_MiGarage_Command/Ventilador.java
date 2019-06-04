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
public class Ventilador implements IReceiver {
    
    private int velocidad = 3;
    
    @Override
    public void subir() {
        if(velocidad < 5)
            velocidad++;
        System.out.println("Se subió la velocidad del ventilador a: "+velocidad);
    }

    @Override
    public void bajar() {
        if(velocidad > 0)
            velocidad--;
        System.out.println("Se bajó la velocidad del ventilador a: "+velocidad);
    }


}
