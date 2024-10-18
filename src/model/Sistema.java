/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Noxie
 */
public class Sistema {

    List<Servicio> lstServicio;

    public Sistema() {
        this.lstServicio = new ArrayList<>();
    }

    public Servicio traerServicio(String codServicio) {
        Servicio elservicio = null;
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                elservicio = servicio;
            }
        }
        if (elservicio == null) {
            throw new IllegalArgumentException("error el servicio no fue econtrado con el codihgo " + codServicio);

        }
        return elservicio;

    }

    public List<Servicio> traerServicio(boolean enPromocion) {
        List<Servicio> ServiciosPro = new ArrayList<>();
        for (Servicio servicio : lstServicio) {
            if (servicio.isEnPromocion() == enPromocion) {
                ServiciosPro.add(servicio);

            }

        }
        return ServiciosPro;

    }

    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
        boolean sihay =false;
        List<Servicio> ServiciosPro = new ArrayList<>();
        for (Servicio servicio : lstServicio) {
            if (servicio.isEnPromocion() == enPromocion && servicio.getFechaPromocion()== dia) {
                ServiciosPro.add(servicio);
                sihay =true;
            }
        }
        if (sihay==false){
            throw new IllegalArgumentException("Error: no hay ninguno con esa fecha en nuestos servicios");
            
        }
        return ServiciosPro;

    }

    public void agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc) {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                throw new IllegalArgumentException("error ya hay una gastronomia  con el codigo  " + codServicio);

            }

        }
        Gastronomia nuevoServicio = new Gastronomia(gastronomia, precio, diaSemDesc, codServicio, porcentajeDescuento, enPromocion);
        lstServicio.add(nuevoServicio);

    }
   
    public void agregarHospedajes(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche) {
        for (Servicio servicio : lstServicio) {
            if (servicio.getCodServicio().equals(codServicio)) {
                throw new IllegalArgumentException("Error: ya hay un servicio con el código " + codServicio);
            }
        }

        Hospedaje nuevoHospedaje = new Hospedaje(hospedaje, precioPorNoche, codServicio, porcentajeDescuento, enPromocion);

        lstServicio.add(nuevoHospedaje);
    }

}
