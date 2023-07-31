/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WorkHome
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona(1245687, "Juan", "Amatitlan","45215489", "juan@email.com");
        Persona p2 = new Persona(1245687, "Jose", "Villa Nueva","54523145", "jose@email.com");
        Persona p3 = new Persona(1245687, "Miguel", "Escuintla","6521478", "miguel@email.com");
        Persona p4 = new Persona(1245687, "Oscar", "Guatemala","5412478", "oscar@email.com");
        Persona p5 = new Persona(1245687, "Roberto", "Peten","6325418", "roberto@email.com");
        
        p1.verDatos();
        p2.verDatos();
        p3.verDatos();
        p4.verDatos();
        p5.verDatos();
        
        
    }
    
}
