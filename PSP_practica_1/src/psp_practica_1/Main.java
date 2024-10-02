/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_practica_1;

/**
 *
 * @author Aitziber
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // invocando start() -> ejecución concurrente.
        // invocando run() -> ejecución secuencial. 
        
        //Crea un hilo que muestre por pantalla los primeros 50 números enteros a intervalos de 100 milisegundos.
//        CaseARunnable r1 = new CaseARunnable();
//        CaseAThread t1 = new CaseAThread();
       
        //Crea un hilo que pida un número N, y luego muestre por pantalla los primeros N números enteros a intervalos de 100 milisegundos.
        CaseBRunnable r2 = new CaseBRunnable();
//        CaseBThread t2 = new CaseBThread();
        
        //Crea un hilo que pida un número N, luego un número M. Se crearán M Hilos, cada uno de los cuales mostrará por pantalla los primeros N números enteros a intervalos de 100 milisegundos.
           
        
              
    }
    
}
