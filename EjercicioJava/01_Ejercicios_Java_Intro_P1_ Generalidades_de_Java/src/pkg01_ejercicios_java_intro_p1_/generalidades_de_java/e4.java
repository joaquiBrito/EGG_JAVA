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
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*---------------------Ejercicio4--------------------------------------
        4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados . La fórmula correspondiente es: F = 32 + (9 * C / 5).
        */
        Scanner ingresar = new Scanner(System.in);
        System.out.println("ingresar grados Celsius: ");
        double gradosCelsius = ingresar.nextDouble();
        double gradosFahrenheit =  32 + (9 * gradosCelsius / 5);
        System.out.println("grados Fahrenheit: " + gradosFahrenheit);
    }
    
}
