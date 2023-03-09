/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicios_java_intro_p1_.generalidades_de_java;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*---------------------EJERCIO1   GUIAPRACTICA----------------------
        Escribir un programa que pida dos números enteros por teclado y calcule 
        la suma de los dos. El programa deberá después mostrar el resultado de
        la suma*/
        
         Scanner leer = new Scanner(System.in);
        /*ingrese un numero mediante leer.nextint*/
        System.out.println("ingrese un numero:");
        int numero1 = leer.nextInt();
        
        /*ingrese un numero mediante leer.nextint*/
        System.out.println("ingrese un numero:");
        int numero2 = leer.nextInt();
        
        int suma = numero1+numero2;
        System.out.println("el resultado de la suma es: "+ suma);
        
        
    }
    
}
