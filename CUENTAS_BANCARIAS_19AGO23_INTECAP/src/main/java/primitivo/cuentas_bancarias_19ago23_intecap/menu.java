/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.cuentas_bancarias_19ago23_intecap;

import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class menu {
    
    public static void ejecucion(){
        CuentaBancaria ob1 = new CuentaBancaria("Juanjo", "Lopez", 300);
        CuentaBancaria ob2 = new CuentaBancaria("Martin", "Gonzalez", 500);
        
        Scanner ns = new Scanner(System.in);
        
        while (true) {
            System.out.println("***********************");
            System.out.println("* 1. Mostrar Cuenta   *");
            System.out.println("* 2. Abonar Cuenta    *");
            System.out.println("* 3. Debitar Cuenta   *");
            System.out.println("* 4. Salir            *");
            System.out.println("***********************");
            
            int opcion = ns.nextInt();
            
            switch (opcion){
                
                case 1:
                    System.out.println("Ingresa la cuenta que desea visualizar 1 o 2: ");
                    int valor = ns.nextInt();
                        System.out.println("Ingresa el valor a abonar: ");
                            if(valor == 1){
                                   ob1.mostrar();
                            } else if(valor == 2){
                                  ob2.mostrar();
                            }else{
                                System.out.println("Ingrese un numero valido");
                            }
                        break;
                        
                case 2:
                    System.out.println("Ingresa la cuenta a abonar 1 o 2: ");
                    valor = ns.nextInt();
                        System.out.println("Ingresa el valor a abonar: ");
                            if(valor == 1){
                                   ob1.abonar(ns.nextInt());
                            } else if(valor == 2){
                                  ob2.abonar(ns.nextInt());
                            }else{
                                System.out.println("Ingrese un numero valido");
                            }
                    break;
                    
                case 3:
                    System.out.println("Ingresa la cuenta a abonar 1 o 2: ");
                    valor = ns.nextInt();
                        System.out.println("Ingresa el valor a abonar: ");
                            if(valor == 1){
                                   ob1.debitar(ns.nextInt());
                            } else if(valor == 2){
                                  ob2.debitar(ns.nextInt());
                            }else{
                                System.out.println("Ingrese un numero valido");
                            }
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    
}

