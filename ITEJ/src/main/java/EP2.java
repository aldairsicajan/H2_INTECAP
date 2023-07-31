/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author WorkHome
 */
public class EP2 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = scan.nextInt();
        
        if (numero >= 0){
            System.out.println("NUMERO POSITIVO");
        }else{
            System.out.println("NUMERO NEGATIVO");
        }
    } 
}
