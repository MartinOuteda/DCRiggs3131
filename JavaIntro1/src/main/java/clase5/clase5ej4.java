/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author Martin
 */
public class clase5ej4 {
    public static void main(String[] args) {
        int num;
    do {
        String pal = leer.nextLine();
        if (pal.substring(0,1).equals("a")) {
            System.out.println("The entered word is correct.");
            System.out.println(pal.substring(0,1));
            num = 1;
        } else {
            System.out.println("The entered word is incorrect.");
            System.out.println("Enter another word:");
            num = 2;
        }
    } while (num == 2);
} 
}