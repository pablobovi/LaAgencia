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
public class Base { 
    private String tipo; 
    private float preciobase; 

    public Base() {
    }

    public Base(String tipo, float preciobase) {
        this.tipo = tipo;
        this.preciobase = preciobase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(float preciobase) {
        this.preciobase = preciobase;
    }

    @Override
    public String toString() {
        return "Base{" + "tipo=" + tipo + ", preciobase=" + preciobase + '}';
    }
    
    
    
    
}
