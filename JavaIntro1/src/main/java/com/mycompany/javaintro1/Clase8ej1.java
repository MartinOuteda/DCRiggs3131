/* Realizar un algoritmo que llene un vector con los 100 primeros números
   enteros y los muestre por pantalla en orden descendente.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaintro1;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Clase8ej1 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        // Llenar el vector con los primeros 100 números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar el vector en orden descendente
        System.out.println("Vector en orden descendente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}