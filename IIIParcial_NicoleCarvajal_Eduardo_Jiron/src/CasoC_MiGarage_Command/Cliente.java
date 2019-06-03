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
public class Cliente {
    
    
    public static void main (String[] args){
        IReceiver ventilador = new Ventilador();
        IReceiver luz = new LuzEstandar();
        IReceiver ac = new AC();
        IReceiver estereo = new Estereo();
        
        AbstractCommand subirVentilador = new UpCommand(ventilador);
        AbstractCommand bajarVentilador = new DownCommand(ventilador);
        AbstractCommand subirLuz = new UpCommand(luz);
        AbstractCommand bajarLuz = new DownCommand(luz);
        AbstractCommand subirAC = new UpCommand(ac);
        AbstractCommand bajarAC = new DownCommand(ac);
        AbstractCommand subirEstereo = new UpCommand(estereo);
        AbstractCommand bajarEstereo = new DownCommand(estereo);
        
        Invocador invoker = new Invocador();
        
        invoker.setCommand(subirVentilador);
        invoker.invoke();
        invoker.setCommand(bajarVentilador);
        invoker.invoke();
        invoker.setCommand(subirLuz);
        invoker.invoke();
        invoker.setCommand(bajarLuz);
        invoker.invoke();
        invoker.setCommand(subirAC);
        invoker.invoke();
        invoker.setCommand(bajarAC);
        invoker.invoke();
        invoker.setCommand(subirEstereo);
        invoker.invoke();
        invoker.setCommand(bajarEstereo);
        invoker.invoke();
        
        
        
    }
}
