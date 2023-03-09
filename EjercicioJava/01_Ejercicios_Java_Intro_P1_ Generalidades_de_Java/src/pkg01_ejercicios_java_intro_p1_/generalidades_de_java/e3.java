/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicios_java_intro_p1_.generalidades_de_java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Usuario
 */
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        
        Scanner ingresar = new Scanner(System.in);
        
        System.out.println("ingrese una frase porfavor:  ");
        String frase = ingresar.next();
        /*convertir frase en minuscula*/
        String fraseEmMinuscula = toLowerCase(frase);
        /*convertir frase en mayuscula*/
        String fraseEnMayuscula = toUpperCase(frase);      
        
        System.out.println("frase en minusucla: " + fraseEmMinuscula);
        System.out.println("frase en minusucla: " + fraseEnMayuscula);   
    }
    
}
