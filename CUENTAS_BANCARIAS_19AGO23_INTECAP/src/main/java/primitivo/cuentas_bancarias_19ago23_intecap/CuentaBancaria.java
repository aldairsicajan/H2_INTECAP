/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.cuentas_bancarias_19ago23_intecap;

//import java.util.Scanner;

/**
 *
 * @author WorkHome
 */
public class CuentaBancaria {
    String nombre;
    String apellido;
    int saldo;
    
    public CuentaBancaria(String nombre, String apellido, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }
    
    public void debitar(int debito){
        this.saldo -= debito;
    }
    
    public void abonar(int abono){
        this.saldo += abono;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Saldo: " + this.saldo);
    }
    
    
    /*
    private float saldocuenta;

    public void Imprimircuenta1(){
        System.out.println("Saldo de la Cuenta No. 1: " + this.saldocuenta);
        System.out.println("");
    }
    
    public void Imprimircuenta2(){
        System.out.println("Saldo de la Cuenta No. 2: " + this.saldocuenta);
        System.out.println("");
    }
    
    public void abonocuenta1(){
        Scanner ns = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a abonar a la cuenta No. 1 :");
        float abono1 = ns.nextFloat();
        
        System.out.println("Saldo cuenta No. 1" + (saldocuenta + abono1));
        System.out.println("");
    }
    
    public void abonocuenta2(){
        Scanner ns = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a abonar a la cuenta No. 2 :");
        float abono2 = ns.nextFloat();
        
        System.out.println("Saldo cuenta No. 1" + (saldocuenta + abono2));
        System.out.println("");
    }
    
    //CONSTRUCTOR
    public CuentaBancaria(float saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    public float getSaldocuenta() {
        return saldocuenta;
    }

    public void setSaldocuenta(float saldocuenta) {
        this.saldocuenta = saldocuenta;
    }
    */

    
    
    
}
