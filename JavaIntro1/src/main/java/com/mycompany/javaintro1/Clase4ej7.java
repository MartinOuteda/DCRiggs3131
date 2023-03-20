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
public class Clase4ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String entrada = "";

        while (!entrada.equals("&&&&&")) {
            System.out.println("Ingrese una cadena de máximo 5 caracteres que comience con X y termine con O:");
            entrada = scanner.nextLine();
            if (entrada.length() == 5 && entrada.charAt(0) == 'X' && entrada.charAt(4) == 'O') {
                correctas++;
            } else if (!entrada.equals("&&&&&")) {
                incorrectas++;
            }
        }

        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}