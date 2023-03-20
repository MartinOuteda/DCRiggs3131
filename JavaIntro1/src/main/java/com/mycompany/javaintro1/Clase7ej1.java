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
public class Clase7ej1 {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    
    System.out.println("Ingrese la operación a realizar (+, -, *, /): ");
    String operacion = scanner.next();
    
    double resultado = 0.0;
    
    switch (operacion) {
      case "+":
        resultado = sumar(num1, num2);
        break;
      case "-":
        resultado = restar(num1, num2);
        break;
      case "*":
        resultado = multiplicar(num1, num2);
        break;
      case "/":
        resultado = dividir(num1, num2);
        break;
      default:
        System.out.println("Operación no válida.");
        return;
    }
    
    System.out.println("El resultado es: " + resultado);
    
    scanner.close();
  }
  
  public static double sumar(double num1, double num2) {
    return num1 + num2;
  }
  
  public static double restar(double num1, double num2) {
    return num1 - num2;
  }
  
  public static double multiplicar(double num1, double num2) {
    return num1 * num2;
  }
  
  public static double dividir(double num1, double num2) {
    return num1 / num2;
  }
  
}