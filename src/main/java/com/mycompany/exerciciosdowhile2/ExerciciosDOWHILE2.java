package com.mycompany.exerciciosdowhile2;

import java.util.Scanner;

public class ExerciciosDOWHILE2 {

public static void main(String[] args) {
//3. Solicite um número inteiro ao usuário e exiba a tabuada desse número.

Scanner teclado = new Scanner(System.in); 
        
       int numero = 0;
       int tabuada = 1;
       
         System.out.print("Digite algum Nº para ver a sua tabuada: ");
         
         numero = teclado.nextInt();
         
         System.out.println("");
         
       do{
           System.out.println(numero + " x " + tabuada + " = " + (numero * tabuada)); 
           tabuada +=1;
           
       }while (tabuada <= 10);
    }
}