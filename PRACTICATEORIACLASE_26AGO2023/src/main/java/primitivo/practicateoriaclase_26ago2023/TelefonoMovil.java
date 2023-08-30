/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivo.practicateoriaclase_26ago2023;

/**
 *
 * @author WorkHome
 */
public class TelefonoMovil extends ProductoElectronico {
    private int capacidadAlmacenamiento;
    private int duracionBateria;

    public TelefonoMovil(int capacidadAlmacenamiento, int duracionBateria, double precio, String marca, String modelo) {
        super(precio, marca, modelo);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.duracionBateria = duracionBateria;
    }
    
    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }
    
}
