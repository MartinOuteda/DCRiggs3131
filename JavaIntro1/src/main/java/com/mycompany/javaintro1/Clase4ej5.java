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
public class Clase4ej5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get limit from user
        System.out.print("Enter a positive limit: ");
        int limit = input.nextInt();
        
        int sum = 0;
        int num;
        int count = 0;
        
        // Keep asking for numbers until sum exceeds limit
        while (sum <= limit) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum += num;
            count++;
        }
        
        System.out.println("Sum of " + count + " numbers entered: " + sum);
    }
}
