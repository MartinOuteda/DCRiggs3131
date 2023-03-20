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
public class Clase4ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase of 8 characters: ");
        String input = scanner.nextLine();
        if (input.length() == 8) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
        scanner.close();
    }
}
