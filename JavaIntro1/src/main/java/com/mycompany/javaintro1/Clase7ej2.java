/*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”./*
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
public class Clase7ej2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String seguir = "Si";
        
        while (seguir.equalsIgnoreCase("Si")) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = input.nextLine();
            
            System.out.print("Ingrese la edad de la persona: ");
            int edad = input.nextInt();
            input.nextLine();
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            
            System.out.print("¿Desea seguir ingresando personas? (Si/No): ");
            seguir = input.nextLine();
        }
        
        System.out.println("Fin del programa");
    }
}