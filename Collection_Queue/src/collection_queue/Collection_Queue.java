/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_queue;


import java.util.ArrayDeque;
import java.util.PriorityQueue;

/**
 *
 * @author Esteban DAlbano
 */
public class Collection_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //*****************PRIORITYQUEUE***********************
        
        PriorityQueue<Integer> cola1 = new PriorityQueue();
        
        //Insertamos elementos en la cola con prioridad
        cola1.add(600);
        cola1.add(300);
        cola1.add(200);
        cola1.add(500);
        cola1.add(800);
        cola1.add(100);
        
        //Mostramos elementos de la cola con prioridad ordenados de < a >
         while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        
         
         //*******************ARRAYDEQUE****************************
         
        ArrayDeque<Integer> cola2 = new ArrayDeque();
        
   
        //Insertamos elementos en la cola
        cola2.add(2000);
        cola2.add(3000);
        cola2.add(4000);
        cola2.add(6000);
        cola2.add(800);
        cola2.add(1573);
        
        
        
       
       
    System.out.println(cola2.getLast());
        
        
    }//FIN MAIN
    
}//FIN COLLECTION
