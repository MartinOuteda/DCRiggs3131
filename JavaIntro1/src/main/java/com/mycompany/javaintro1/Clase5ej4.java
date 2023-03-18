/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaintro1;

import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Clase5ej4 {
    public static void main(String[] args) {
        System.out.println("ingresa una palabra");
        Scanner leer = new Scanner (System.in);
        
        int num ;
         do {
          
          String pal = leer.nextLine();
            if (pal.substring(0,1).equals("a")) {
                System.out.println("la frase ingresada es correcta");
                System.out.println(pal.substring(0,1));
                num = 1;
            } else {
                System.out.println("la frase ingresa es incorrecta,");
                System.out.println("Ingrese otra frase");
                num = 2;
            }

        } while (num == 2);
    } 
}