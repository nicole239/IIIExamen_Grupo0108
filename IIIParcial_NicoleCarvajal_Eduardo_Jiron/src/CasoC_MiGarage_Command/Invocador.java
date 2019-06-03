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
public class Invocador {
    
    private AbstractCommand command;
    
    
    public void setCommand(AbstractCommand command){
        this.command = command;
    }
    
    public void invoke(){
        command.execute();
    }
}
