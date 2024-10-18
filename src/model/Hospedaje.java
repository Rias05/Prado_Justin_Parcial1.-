/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Noxie
 */  
import java.time.LocalDate;
public class Hospedaje extends Servicio {
 
    private String hospedaje;
    private double precioPorNoche;
    public Hospedaje(String hospedaje, double precioPorNoche, String codServicio, double porcenatajeDescuento, boolean enPromocion) {
        super(codServicio, porcenatajeDescuento, enPromocion);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }



    // Atributos específicos de Hospedaje

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioBase = precioPorNoche;
        int numeroDia = dia.getDayOfWeek().getValue();
        boolean correcto = false;
        if (enPromocion && numeroDia >= 1 && numeroDia <= 5) {
            precioBase -= precioBase * (porcenatajeDescuento / 100);
            correcto = true;
        }
        if (correcto== false){
            throw new IllegalArgumentException("no cumple las normaas");
            
        }

        return precioBase;
    }
   

    
}
