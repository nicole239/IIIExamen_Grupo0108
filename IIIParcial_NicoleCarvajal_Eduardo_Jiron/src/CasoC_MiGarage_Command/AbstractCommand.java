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
public abstract class AbstractCommand {
    
    protected IReceiver receiver;
    
    public AbstractCommand(IReceiver receiver){
        this.receiver = receiver;
    }
    
    public abstract void execute();
}
