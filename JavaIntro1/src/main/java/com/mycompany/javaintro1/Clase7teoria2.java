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
public class Clase7teoria2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese num1: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese num2: ");
        int num2 = sc.nextInt();
        EsMultiplo (num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
      if(num1 % num2 == 0) {
        System.out.println(num1 + " es múltiplo de " + num2);
      } else {
        System.out.println(num1 + " no es múltiplo de " + num2);
      }
    }    
}



