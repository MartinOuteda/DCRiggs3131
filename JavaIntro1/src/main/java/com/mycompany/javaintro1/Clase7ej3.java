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
public class Clase7ej3 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros que quieres convertir: ");
        double euros = sc.nextDouble();
        sc.nextLine(); // Consumimos el salto de línea que queda en el buffer
        
        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        String moneda = sc.nextLine().toLowerCase();
        
        convertirMoneda(euros, moneda);
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        double resultado = 0;
        String mensaje = "";
        
        switch (moneda) {
            case "libras":
                resultado = euros * 0.86;
                mensaje = euros + " euros son " + resultado + " libras.";
                break;
            case "dolares":
                resultado = euros * 1.28611;
                mensaje = euros + " euros son " + resultado + " dólares.";
                break;
            case "yenes":
                resultado = euros * 129.852;
                mensaje = euros + " euros son " + resultado + " yenes.";
                break;
            default:
                mensaje = "Moneda no soportada.";
                break;
        }
        
        System.out.println(mensaje);
    }
}