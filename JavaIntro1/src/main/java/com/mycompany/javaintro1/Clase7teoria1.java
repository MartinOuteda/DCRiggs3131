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
public class Clase7teoria1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres terminada en punto:");
        String secuencia = scanner.nextLine();
        String codificacion = codificar(secuencia);
        System.out.println(codificacion);
    }

    public static String codificar(String secuencia) {
        String resultado = "";
        for (int i = 0; i < secuencia.length() - 1; i++) {
            char caracter = secuencia.charAt(i);
            switch (caracter) {
                case 'a':
                    resultado += "@";
                    break;
                case 'e':
                    resultado += "#";
                    break;
                case 'i':
                    resultado += "$";
                    break;
                case 'o':
                    resultado += "%";
                    break;
                case 'u':
                    resultado += "*";
                    break;
                case 'A':
                    resultado += "@";
                    break;
                case 'E':
                    resultado += "#";
                    break;
                case 'I':
                    resultado += "$";
                    break;
                case 'O':
                    resultado += "%";
                    break;
                case 'U':
                    resultado += "*";
                    break;
                default:
                    resultado += caracter;
                    break;
            }
        }
        resultado += ".";
        return resultado;
    }
}
