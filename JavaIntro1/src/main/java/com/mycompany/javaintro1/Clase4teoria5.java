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
public class Clase4teoria5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[4];

    // read 4 numbers from user
    for (int i = 0; i < 4; i++) {
      System.out.print("Enter a number between 1 and 20: ");
      int number = input.nextInt();
      while (number < 1 || number > 20) {
        System.out.print("Number should be between 1 and 20. Enter again: ");
        number = input.nextInt();
      }
      numbers[i] = number;
    }

    // print asterisks for each number
    for (int i = 0; i < 4; i++) {
      System.out.print(numbers[i] + " ");
      for (int j = 0; j < numbers[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
