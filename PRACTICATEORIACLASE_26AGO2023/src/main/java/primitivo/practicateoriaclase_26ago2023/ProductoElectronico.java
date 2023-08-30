/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.practicateoriaclase_26ago2023;

/**
 *
 * @author WorkHome
 */
public class ProductoElectronico {
    private double precio;
    private String marca;
    private String modelo;

    public ProductoElectronico(double precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
