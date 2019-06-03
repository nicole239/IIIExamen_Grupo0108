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
public class LuzEstandar implements IReceiver {
    
    private int intencidad = 5;
    
    @Override
    public void subir() {
        if(intencidad < 10)
            intencidad++;
        System.out.println("Se subió la intencidad de la luz a: "+intencidad);
    }

    @Override
    public void bajar() {
        if(intencidad > 0)
            intencidad--;
        System.out.println("Se bajó la intencidad de la luz a: "+intencidad);
    }
}
