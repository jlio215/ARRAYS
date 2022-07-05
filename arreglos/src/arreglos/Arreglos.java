/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jlio
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double [] arr1 = new double[7];
       double [] arr2 = new double[7];
       double [] arr3 = new double[7];
       
       Scanner leer= new Scanner (System.in);
       
       for(int i = 0; i < 7; i++){
       System.out.println("Ingrese numero");
           arr1 [i] = leer.nextDouble();}
        for(int i = 0; i < 7; i++){
       System.out.println("Ingrese numero");
           arr2 [i] = leer.nextDouble();}
         for(int i = 0; i < 7; i++){
           arr3 [i] = arr1[i] - arr2 [i];
        }
         double suma1 = 0;
         double suma2 = 0;
         
         for(int i = 0; i < 7; i++){
           suma1 += arr1[i];
           suma2 += arr2[2];
        }
          double prom = (suma1 + suma2)/14;
  
        System.out.println("su array es "+Arrays.toString(arr1));
        System.out.println("su array es "+Arrays.toString(arr2));
        System.out.println("el array resultante de la diferencia es "+Arrays.toString(arr3));
        System.out.println("el promedio de datos es "+prom);
        
        
    
}}
