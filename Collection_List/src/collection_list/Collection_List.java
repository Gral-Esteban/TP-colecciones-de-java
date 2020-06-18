/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Esteban DAlbano
 */
public class Collection_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo (instancio) un objeto "imput" de tipo escaner para ingresar valores por teclado
        Scanner imput =new Scanner(System.in);
        
        
        //**********************ARRAYLIST****************************
        
// Insertar elementos
        ArrayList<Integer> list1 = new ArrayList();
        
        list1.add(6);
        list1.add(2);
        list1.add(8);
        list1.add(12);
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(4);
        
   /*for(int i=0; i<list1.size();i++){
       System.out.println(list1.get(i).toString());

   }*/
   
   // Elimino un elemento y muestro por pantalla la lista resultante
   list1.remove(0);
   
   for(int i=0; i<list1.size();i++){
       System.out.println(list1.get(i).toString());
   } 
   
   // recorrer por los elementos con FOR EACH
   list1.add(16);
   for(Object variable : list1){
       System.out.println(variable);
   }
   
   //Ordeno el arraylist de menor a mayor y lo muestro por pantalla
   Collections.sort(list1);
   
   for(Object variable : list1){
       System.out.println(variable);}
   
   
   //******************LINKEDLIST***************************
   
   LinkedList<Integer> list2= new LinkedList();
   
   //Insertar elementos
   list2.add(25);
   list2.add(18);
   list2.add(34);
   list2.add(68);
   list2.add(22);
   list2.add(11);
   
   //Elimino un elemento
   list2.remove(2);
   
   // recorrer por los elementos con FOR EACH
   list2.add(16);
   for(Object variable : list2){
       System.out.println(variable);
   }
   
   //Ordeno el arraylist de menor a mayor y lo muestro por pantalla
   Collections.sort(list2);
   
   for(Object variable : list2){
       System.out.println(variable);}
   
   
   
   //******************VECTOR***************************
   
   Vector<Integer> list3= new Vector();
   
   //Insertar elementos
   list3.add(60);
   list3.add(18);
   list3.add(34);
   list3.add(68);
   list3.add(22);
   list3.add(78);
   
   //Elimino un elemento
   list3.remove(2);
   
   // recorrer por los elementos con FOR EACH
   list3.add(16);
   for(Object variable : list3){
       System.out.println(variable);
   }
   
   //Ordeno el arraylist de menor a mayor y lo muestro por pantalla
   Collections.sort(list3);
   
   for(Object variable : list3){
       System.out.println(variable);}
   
   
   
   
}//FIN DEL MAIN
    
    
}//FIN DE COLLECTION LIST
