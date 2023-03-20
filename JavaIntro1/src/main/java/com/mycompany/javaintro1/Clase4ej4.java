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
public class Clase4ej4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String phrase = input.nextLine();

        if (phrase.substring(0, 1).equals("A")) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }
}
