/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author WorkHome
 */
public class EP4 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numero2 = scan.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int numero3 = scan.nextInt();
        
        if(numero1 > numero2 && numero2 > numero3){
            System.out.println(numero1 + " , "+ numero2 + " , " + numero3);
        }else if(numero1 < numero2 && numero2 < numero3 ){
            System.out.println(numero3 + " , " + numero2 + " , " + numero1);
        }else if(numero1 < numero2 && numero2 > numero3 ){
            System.out.println(numero2 + " , " + numero3 + " , " + numero1);
        }else if(numero1 > numero2 && numero2 < numero3 ){
            System.out.println(numero1 + " , " + numero3 + " , " + numero2);
        }else{
            System.out.println("LOS TRES NUMEROS SON IGUALES");
        }
    }
}
