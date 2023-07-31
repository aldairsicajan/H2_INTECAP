/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author WorkHome
 */
public class Persona {
    private int nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    
    public void verDatos(){
        System.out.println("Nit: " +this.nit);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Email: " + this.email);
    }

    public Persona(int nit, String nombre, String direccion, String telefono, String email) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}