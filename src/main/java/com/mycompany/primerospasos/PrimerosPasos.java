/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerospasos;
import java.util.Scanner;
/**
 *
 * @author PABLO
 */
public class PrimerosPasos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            
            System.out.println("Introduzca un número");
            numero = sc.nextInt();
            
            System.out.println((numero%2) == 0?"Par":"Impar");
        }
    }
}
