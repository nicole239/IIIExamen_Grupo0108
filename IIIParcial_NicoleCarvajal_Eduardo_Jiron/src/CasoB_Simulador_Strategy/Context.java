/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Context {
    
     public static void main (String[] args){
         Scanner scan = new Scanner(System.in);
         SimuladorGenerico simulador;
         Evento e1 = new Evento("Desayunar",8.0d);
         Evento e2 = new Evento("Almorzar",12.0d);
         Evento e3 = new Evento("Cenar",18.0d);
         System.out.println("Seleccione un tipo de simulador:");
         System.out.println("   1. Simulador con  cola");
         System.out.println("   2. Simulador2");
         System.out.println(">> ");
         
         int opcion = scan.nextInt();
         switch(opcion){
             case 1:                 
                 Queue<Evento> eventos = new LinkedList<>();
                 eventos.add(e1);
                 eventos.add(e2);
                 eventos.add(e3);
                 simulador = new SimuladorColaEventos(eventos);
                 break;
             default:
                 ArrayList<Evento> eventos2 = new ArrayList<>();
                 eventos2.add(e2);
                 eventos2.add(e1);
                 eventos2.add(e3);
                 simulador = new Simulador2(eventos2);
                 break;
         }
         
         simulador.simular();
     }    
}
