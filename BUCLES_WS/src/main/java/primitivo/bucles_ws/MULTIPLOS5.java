/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.bucles_ws;

/**
 *
 * @author WorkHome
 */
public class MULTIPLOS5 {
    
    public static void main (String[] Args ){
        
        int multiplo[] = new int[10];
        int dato = 5;
        
        for (int i = 0; i < multiplo.length; i++) {
            
            multiplo[i] = dato;
            dato += 5;
            System.out.println(multiplo[i]);
            
        }
        
    }
    
}
