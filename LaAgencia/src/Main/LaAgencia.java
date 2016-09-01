/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.AdaptadorApi;
import Modelo.Ciudad;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class LaAgencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("hola");
         ArrayList <Ciudad> ciudades = AdaptadorApi.inicializarCiudades();
         System.out.println(ciudades);
    }
    
}
