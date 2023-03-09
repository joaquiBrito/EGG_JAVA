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
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*-----------------Ejercicio5-------------------------------------------
        Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
        Nota: investigar la función Math.sqrt().*/
        
        Scanner ingresar = new Scanner(System.in);
        System.out.println("ingrear un numero:  ");
        int  numero =ingresar.nextInt();
        int doble = numero*numero;
        int triple = numero*numero*numero;
        double raiz  = Math.sqrt(numero);
        
        System.out.println("doble: "+doble);
        System.out.println("triple: "+triple);
        System.out.println("raiz: "+raiz);
    }
    
}
