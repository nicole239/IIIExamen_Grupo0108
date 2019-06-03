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
public class DownCommand extends AbstractCommand{
    
    public DownCommand(IReceiver receiver){
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.bajar();
    }
    
}
