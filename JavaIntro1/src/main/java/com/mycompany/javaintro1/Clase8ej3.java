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
public class Clase8ej3 {
    public static void main(String[] args) {
        int[] contador = new int[6]; // inicializamos el contador para cada categoría de dígitos
        for (int i = 0; i < vector.length; i++) {
            int digitos = String.valueOf(vector[i]).length(); // obtenemos la cantidad de dígitos del número actual
            if (digitos > 5) { // si el número tiene más de 5 dígitos, lo ignoramos
                continue;
            }
            contador[digitos]++; // incrementamos el contador correspondiente
        }
        for (int i = 1; i <= 5; i++) { // imprimimos el resultado
            System.out.println("Cantidad de números de " + i + " dígito(s): " + contador[i]);
        }
    }
}

