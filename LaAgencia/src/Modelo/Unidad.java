/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author pablo.navarro
 */
public class Unidad { 
    private String identificacion; 

    public Unidad() {
    }

    public Unidad(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Unidad{" + "identificacion=" + identificacion + '}';
    }
    
    
    
}
