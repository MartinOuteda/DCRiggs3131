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
public class Clase8teoria1 {
    public static void main(String[] args) {
    // Definimos la cantidad de compañeros de equipo que hay
    int cantidad_compañeros = 5;

    // Creamos el vector con el tamaño adecuado y el tipo de dato String para almacenar nombres
    String[] Equipo = new String[cantidad_compañeros];
    
    
    Equipo[0] = "Juan";
    Equipo[1] = "Pedro";
    Equipo[2] = "María";
    Equipo[3] = "Ana";
    Equipo[4] = "Luis";
    
    for (int i = 0; i < Equipo.length; i++) {
        System.out.println(Equipo[i]);
    }
    
    System.out.println("El primer compañero de equipo es: " + Equipo[0]);

    }
}
