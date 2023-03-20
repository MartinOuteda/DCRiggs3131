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
public class Clase8ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario el tamaño del vector y el número a buscar
        System.out.println("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese el número a buscar: ");
        int numBuscar = sc.nextInt();
        
        // Llenar el vector con valores aleatorios
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rnd.nextInt(100); // Se generan números aleatorios del 0 al 99
        }
        
        // Buscar el número en el vector
        boolean encontrado = false;
        int pos = -1; // Si no se encuentra el número, pos será -1
        for (int i = 0; i < n; i++) {
            if (vector[i] == numBuscar) {
                encontrado = true;
                if (pos == -1) {
                    pos = i;
                } else {
                    System.out.println("El número está repetido en la posición " + i);
                }
            }
        }
        
        // Mostrar los resultados
        if (encontrado) {
            System.out.println("El número " + numBuscar + " se encuentra en la posición " + pos);
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}
