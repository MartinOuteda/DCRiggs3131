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
public class Clase4ej6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, choice;
        char confirm;

        do {
            System.out.print("Enter two positive integers: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            
            System.out.println("MENU");
            System.out.println("1- Add");
            System.out.println("2- Subtract");
            System.out.println("3- Multiply");
            System.out.println("4- Divide");
            System.out.println("5- Quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                    break;
                case 5:
                    System.out.print("Are you sure you want to quit? (S/N): ");
                    confirm = input.next().charAt(0);
                    if (confirm == 'S' || confirm == 's') {
                        System.out.println("Exiting program...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
}
