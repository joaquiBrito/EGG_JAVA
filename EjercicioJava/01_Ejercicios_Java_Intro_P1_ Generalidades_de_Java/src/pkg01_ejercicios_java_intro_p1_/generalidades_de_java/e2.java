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
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*------------------------EJERCICIO"2-----------------------------------------------------
        Escribir un programa que pida tu nombre, lo guarde en una variable y lomuestre por pantalla.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre porfavor:");
        String nombre = leer.next();
        System.out.println("el nombre ingresado es: "+nombre);
    }
    
}
