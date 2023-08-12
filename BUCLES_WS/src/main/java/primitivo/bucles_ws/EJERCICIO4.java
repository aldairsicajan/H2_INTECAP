/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.bucles_ws;

/**
 *
 * @author WorkHome
 */
public class EJERCICIO4 {
    
    public static void main (String[] Args){
        
        int n = 1;
        
        while (n<=10) {
            System.out.println("TABLA DEL " + n);
            for (int i = 1; i<=10; i++){
                
                System.out.println(n + " X " + i + " = " + n*i);
               
            }
            System.out.println("");
            n++;
              
        }
        
    }
    
}
