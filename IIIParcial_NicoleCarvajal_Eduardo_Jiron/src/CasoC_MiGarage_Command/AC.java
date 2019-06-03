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
public class AC implements IReceiver {
    
    private int temperatura = 21;
    
    @Override
    public void subir() {
        if(temperatura < 30)
            temperatura++;
        System.out.println("Se subió la temperatura a: "+temperatura+" grados");
    }

    @Override
    public void bajar() {
        if(temperatura > -5)
            temperatura--;
        System.out.println("Se bajó la temperatura a: "+temperatura+" grados");
    }

}
