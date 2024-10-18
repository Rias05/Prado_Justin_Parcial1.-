/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Noxie
 */
public class Gastronomia extends Servicio {
    private String gastronomia;
    private double precio;
    private int diaSemDesc; 

    public Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcenatajeDescuento, boolean enPromocion) {
        super(codServicio, porcenatajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDiaSemDesc() {
        return diaSemDesc;
    }

    public void setDiaSemDesc(int diaSemDesc) {
        this.diaSemDesc = diaSemDesc;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = precio;
        DayOfWeek diaDeLaSemana = dia.getDayOfWeek();

        if(enPromocion && (diaDeLaSemana.getValue() == diaSemDesc)){
           precioFinal -= precioFinal * ( porcenatajeDescuento/ 100);

            
        }
        return precioFinal;
        
    }
    

    
}
