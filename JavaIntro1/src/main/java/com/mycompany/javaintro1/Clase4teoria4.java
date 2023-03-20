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
public class Clase4teoria4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int num;
        
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            
            if (num == 0) {
                System.out.println("The number zero was captured.");
                break;
            }
            
            if (num < 0) {
                continue;
            }
            
            sum += num;
            count++;
        } while (count < 20);
        
        System.out.println("The sum of the positive numbers is: " + sum);
    }
}
