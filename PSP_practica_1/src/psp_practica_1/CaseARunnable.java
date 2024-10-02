/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_practica_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aitziber
 */
public class CaseARunnable implements Runnable{
    //Crea un hilo que muestre por pantalla los primeros 50 números enteros a intervalos de 100 milisegundos.
    public CaseARunnable(){
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("(Runnable) Estos son los 50 primeros enteros:");
        for(int i =0;i<50;i++){
            try {
                System.out.println("\t- " + i);
                
                //intervalo de 100 milisegundos
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CaseARunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
}
