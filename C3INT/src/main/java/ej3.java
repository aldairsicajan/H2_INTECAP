/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class ej3 {
    public static void main(String[] args) {
        int num;
    int doble;
    int triple;
    
    Scanner ab = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    num = ab.nextInt();
    
    doble = num * 2;
    triple = num * 3;
    
    System.out.println("el doble del numero es: " + doble);
    System.out.println("El triple del numero es: " + triple);
    }
    
}
