/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author WorkHome
 */
public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private String marca;
    
    //Imprimir Datos
    public void verdatos(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio: " + this.precio);
        System.out.println("Marca: " + this.marca);
    }
    
    //Constructor
    public Producto(int codigo, String nombre, int cantidad, double precio, String marca){

        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }
    
    //Metodos Getters
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getMarca(){
        return marca;
    }
    
    //Metodos Setters
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
}
