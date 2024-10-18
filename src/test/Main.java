/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.util.List;
import model.Gastronomia;
import model.Hospedaje;
import model.Servicio;
import model.Sistema;

/**
 *
 * @author Noxie
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1-1");
        try {
            Gastronomia gastronomiaInvalida = new Gastronomia("Hamburguesa criolla", 180.0, 4, "4892", 15.0, true);
            System.out.println("Objeto creados: " + gastronomiaInvalida);
        } catch (IllegalArgumentException e) {
            System.out.println(  e.getMessage());
        }

        System.out.println("1-2");
        try {
            Gastronomia gastronomiaValida = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true);
            System.out.println("Objeto creado correctamente: " + gastronomiaValida);
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }

        System.out.println("1-3");
        try {
            Hospedaje hospedajeInvalido = new Hospedaje("Cabaña 3 personas", 1500.0, "2872", 10.0, true);
            System.out.println("Objeto creado " + hospedajeInvalido);
        } catch (IllegalArgumentException e) {
            System.out.println(  e.getMessage());
        }

        System.out.println("1-4");
        try {
            Hospedaje hospedajeValido = new Hospedaje("Cabaña 3 personas", 1500.0, "287282", 10.0, true);
            System.out.println("Objeto creado corrrecteamnte: " + hospedajeValido);
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }
        
        System.out.println("2-1");
        try {
            Gastronomia gastronomia = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true);

            LocalDate dia1 = LocalDate.of(2020, 10, 28);
            double precioFinalGastronomia = gastronomia.calcularPrecioFinal(dia1);
            System.out.println("Precio final Gastronomia: " + precioFinalGastronomia);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular precio final Gastronomia: " + e.getMessage());
        }
        System.out.println("2-2");
        try {
            Hospedaje hospedaje = new Hospedaje("Cabaña 3 personas", 1500.0, "287282", 10.0, true);
            LocalDate dia2 = LocalDate.of(2020, 10, 27);
            double precioFinalHospedaje = hospedaje.calcularPrecioFinal(dia2);
            System.out.println("Precio final Hospedaje: " + precioFinalHospedaje);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular precio final Hospedaje: " + e.getMessage());
        }

        // 3) Agregar Servicios
        System.out.println("3");
        Sistema sistema = new Sistema();
        
        try { 
            //  public void agregarHospedajes(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche)
            sistema.agregarGastronomia("858927", 15.0, true, "Milanesa con puré", 350.0, 3);
            sistema.agregarHospedajes("489259", 10.0, true, "Habitación triple", 2200.0);
            

            
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
        }
       

        try {
            // Crear objeto Hospedaje
            sistema.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
            sistema.agregarHospedajes("758972",15.0,true,"Habitación simple", 1000.0);
            
            
         
        } catch (IllegalArgumentException e) {
            System.out.println(  e.getMessage());
        }
        System.out.println("4");
        try{
            List<Servicio> serviciosEnPromocion = sistema.traerServicio(true);
            for(Servicio s: serviciosEnPromocion){
                System.out.println(s);
                
                
                
                
            }
            
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }
        System.out.println(	"(4-2)" );
        try{
            LocalDate fechaBuscada = LocalDate.of(2020, 10, 28);

            List<Servicio> serviciosEnPromocion = sistema.traerServicio(true, fechaBuscada);
            for (Servicio s :serviciosEnPromocion ){
                System.out.println(s);
                
            }
            
        }
        
        catch(IllegalArgumentException e){
            
            System.out.println("no hay"+e.getMessage());
            
        }
        

        
        
    }
        
    }
        

    

