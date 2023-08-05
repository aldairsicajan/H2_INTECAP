/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WorkHome
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto prod1 = new Producto(12458, "Juan Gomez", 25, 3249.99, "Lenovo\n");
        Producto prod2 = new Producto(63254, "Carlos Gonzalez", 50, 2749.99, "HP\n");
        Producto prod3 = new Producto(85421, "Hugo Guerrero", 95, 1225, "Dell\n");
        Producto prod4 = new Producto(78541, "Jose Pinto", 62, 3000, "Acer\n");
        Producto prod5 = new Producto(96521, "Daniel Morado", 85, 4500, "Samsung\n");
        
        prod1.verdatos();
        prod2.verdatos();
        prod3.verdatos();
        prod4.verdatos();
        prod5.verdatos();
    }
    
}
