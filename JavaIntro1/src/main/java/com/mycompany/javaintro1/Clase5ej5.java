/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * 
 */
package com.mycompany.javaintro1;

/**
 *
 * @author Martin
 */
public class Clase5ej5 {
     public static void main(String[] args) {
        System.out.println("ingrese el valor limite positivo");
        Scanner leer = new Scanner(System.in);
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese valores a sumar");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma < limite);
        System.out.println("Has llegado a sumar el valor limite!");
        System.out.println("la suma dio: "+suma );
    }

}
}
