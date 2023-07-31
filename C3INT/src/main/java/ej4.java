/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class ej4 {
    public static void main(String[] args) {
        float grados;
    float fahrenheit;
    
    Scanner ant = new Scanner(System.in);
    System.out.print("Ingrese el valor en grados: ");
    grados = ant.nextFloat();
    
    fahrenheit = 32 + (9 * (grados / 5));
    
    System.out.println("Los grados Fahrenheit son: " + fahrenheit);
        
    }
    
    
}
