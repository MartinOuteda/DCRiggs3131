/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javaintro1;

import java.util.Scanner;

public class Clase4teoria1 {
    public static void main(String[] args) {
        System.out.println("Ingresa un número:");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = 7;
        if (num1 < num2) {
            System.out.println("La variable num1 aloja un número menor a la variable num2");
        } else {
            System.out.println("La variable num1 aloja un número mayor a la variable num2");
        }
    }
}
