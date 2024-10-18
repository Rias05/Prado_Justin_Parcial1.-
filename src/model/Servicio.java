/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Noxie
 */
public abstract class Servicio {

    protected String codServicio;
    protected double porcenatajeDescuento;
    protected boolean enPromocion;
    protected LocalDate fechaPromocion; // Atributo para la fecha de promoción

    public Servicio(String codServicio, double porcenatajeDescuento, boolean enPromocion) {
        if (codServicio.length() != 6) {
            throw new IllegalArgumentException("El código del servicio debe tener exactamente 6 caracteres.");
        }
        this.codServicio = codServicio;
        this.porcenatajeDescuento = porcenatajeDescuento;
        this.enPromocion = enPromocion;
        this.fechaPromocion = LocalDate.now();
    }

    public LocalDate getFechaPromocion() {
        return fechaPromocion;
    }

    public void setFechaPromocion(LocalDate fechaPromocion) {
        this.fechaPromocion = fechaPromocion;
    }

    public String getCodServicio() {
        return codServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codServicio=" + codServicio + ", porcenatajeDescuento=" + porcenatajeDescuento + ", enPromocion=" + enPromocion + ", fechaPromocion=" + fechaPromocion + '}';
    }

    

    public void setCodServicio(String codServicio) {
        this.codServicio = codServicio;
    }

    public double getPorcenatajeDescuento() {
        return porcenatajeDescuento;
    }

    public void setPorcenatajeDescuento(double porcenatajeDescuento) {
        this.porcenatajeDescuento = porcenatajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public abstract double calcularPrecioFinal(LocalDate dia);

}
