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
public class Puerta implements IReceiver {
    
    private boolean cerrada;

    @Override
    public void subir() {
        cerrada = false;
        System.out.println("La puerta del garage está : "+(cerrada ? "cerrada" : "abierta"));
    }

    @Override
    public void bajar() {
        cerrada = true;
        System.out.println("La puerta del garage está : "+(cerrada ? "cerrada" : "abierta"));
    }
    
}
