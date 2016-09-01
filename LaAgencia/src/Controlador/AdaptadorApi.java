/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;
import Modelo.Ciudad;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Melisa
 */
public class AdaptadorApi {

    private static ArrayOfCiudadSvc obtenerCiudades(java.lang.String codigo) throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerCiudades(codigo);
    }
   static ArrayList<Ciudad> ciudades= new ArrayList<Ciudad>();
    
 public static   ArrayList<Ciudad> inicializarCiudades() {
      System.out.println("hola");
    
        try {
            
           
            ArrayOfCiudadSvc a=  obtenerCiudades("d6a25095-9593-49ea-8438-dea5975f8499");
           
            for(int i= 0; i<a.getCiudadSvc().size();i++)
             {  Ciudad ciudad = new Ciudad();
                 ciudad.setCodigo(a.getCiudadSvc().get(i).getCodigo());
                 ciudad.setNombre(a.getCiudadSvc().get(i).getDescripcion().getValue());
                 ciudades.add(ciudad); 
             }
            return ciudades;
             }
            
         catch (IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage ex) {
             System.out.println("ta mal");
            Logger.getLogger(AdaptadorApi.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }


}
    
    
    
}
