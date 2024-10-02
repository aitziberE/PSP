/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_practica_1;

import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Util;

/**
 *
 * @author Aitziber
 */
public class CaseBRunnable implements Runnable{
    //Crea un hilo que pida un número N, y luego muestre por pantalla los primeros N números enteros a intervalos de 100 milisegundos.
    public CaseBRunnable(){
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int num;

        // Repetimos el ciclo hasta que el usuario ingrese un número mayor o igual a 0
        do {
            num = Util.leerInt("Introduce un numero");
            if (num < 0) {
                System.out.println("El número debe ser positivo.");
            }
        } while (num < 0); 
                
        System.out.println("(Runnable) Estos son los "+num+" primeros enteros:");
        for(int i =0;i<num;i++){
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
