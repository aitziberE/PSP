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
public class CaseCRunnable implements Runnable{
    //Crea un hilo que pida un número N, luego un número M. Se crearán M Hilos, cada uno de los cuales mostrará por pantalla los primeros N números enteros a intervalos de 100 milisegundos.
    
    private int n;
    
    public CaseCRunnable(int n){        
        this.n=n; 
    }

    
    @Override
    public void run() {
        
                
        System.out.println("(Runnable) Estos son los "+n+" primeros enteros:");
        for(int i =0;i<n;i++){
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
