/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


/**
 *
 * @author Esteban DAlbano
 */
public class Collection_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //*******************HASHSET***********************
        
        HashSet<Integer> conjunto1 = new HashSet();
        
        //Insertamos elementos
        conjunto1.add(23);
        conjunto1.add(42);
        conjunto1.add(20);
        conjunto1.add(16);
        conjunto1.add(12);
        
        //Eliminamos el elemento particular
        conjunto1.remove(20);
        
        
        
        //recorremos la coleccion de elementos
        for(Object variable : conjunto1){
       System.out.println(variable);}
        
         //*******************LINKEDHASHSET***********************
        
        LinkedHashSet<Integer> conjunto2 = new LinkedHashSet();
        
        //Insertamos elementos
        conjunto2.add(100);
        conjunto2.add(300);
        conjunto2.add(400);
        conjunto2.add(50);
        conjunto2.add(600);
        
        //Eliminamos el elemento particular
        conjunto2.remove(50);
        
        
        
        //recorremos la coleccion de elementos
        for(Object variable : conjunto2){
       System.out.println(variable);}
        
        
        
        //*******************TREESET***********************
        
        TreeSet<Integer> conjunto3 = new TreeSet();
        
        //Insertamos elementos
        conjunto3.add(6000);
        conjunto3.add(3000);
        conjunto3.add(4000);
        conjunto3.add(500);
        conjunto3.add(1000);
        
        //Eliminamos el elemento particular 
        conjunto3.remove(500);
        
        
        
        //recorremos la coleccion de elementos
        for(Object variable : conjunto3){
       System.out.println(variable);}
        
    } //FIN MAIN
    
} //FIN COLLECTION
