/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author WorkHome
 */
public class EP3 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
           System.out.println("Ingrese el primer numero: ");
           int numero1 = scan.nextInt();
           System.out.println("Ingrese el segundo numero: ");
           int numero2 = scan.nextInt();
           
           if(numero1 > numero2){
               System.out.println(numero1 + " , " + numero2);
           }else if(numero1 < numero2){
               System.out.println(numero2 + " , " + numero1);   
            }else{
               System.out.println("SON IGUALES");   
            }       
    }
}
