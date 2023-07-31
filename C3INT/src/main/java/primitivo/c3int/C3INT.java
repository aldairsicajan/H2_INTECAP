/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package primitivo.c3int;

import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class C3INT {

    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner nm = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = nm.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = nm.nextInt();

        System.out.println("Los numeros ingresados son: " + num1 + "," + num2);
    }
}
