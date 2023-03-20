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
public class Clase4teoria3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = -1; // initialize the grade to an invalid value

        while (grade < 0 || grade > 10) { // keep asking for the grade until it's valid
            System.out.print("Enter a grade between 0 and 10: ");
            grade = scanner.nextDouble();
        }

        System.out.println("The grade is: " + grade);
    }
}
