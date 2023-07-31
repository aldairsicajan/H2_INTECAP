/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class ej5 {
    public static void main(String[] args) {
       float radio;
    float longitud;
    float area;
    
    Scanner nu = new Scanner(System.in);
    System.out.println("Ingrese el valor del radio: ");
    radio = nu.nextFloat();
    
    longitud = (int) (2 * Math.PI * radio);
    area = (int) ( Math.PI * (radio * radio));
    
            
    System.out.println("La Longitud es: " + longitud);
    System.out.println("El area es: " + area);
    }
    
}
