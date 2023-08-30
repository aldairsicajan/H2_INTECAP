/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.practicateoriaclase_26ago2023;

/**
 *
 * @author WorkHome
 */
public class Tableta extends ProductoElectronico{
    private double tamanoPantalla;
    private String resolucionPantalla;

    public Tableta(double tamanoPantalla, String resolucionPantalla, double precio, String marca, String modelo) {
        super(precio, marca, modelo);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucionPantalla = resolucionPantalla;
    }
    
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
}
