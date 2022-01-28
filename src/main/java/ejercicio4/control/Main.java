/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.control;

import ejercicio4.model.EventoHistorico;
import ejercicio4.model.Fecha;
import ejercicio4.model.Galeria;
import ejercicio4.model.Trayectoria;

/**
 *
 * @author edwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha = new Fecha(1,9,1939);
        Galeria galeria = new Galeria();
        Trayectoria trayectoria = new Trayectoria();
        
        
        EventoHistorico evt = new EventoHistorico("Guerra", "Europa", "WW2", 
            "guerra a escala mundial",fecha, galeria, trayectoria);
        
        evt.añadirTrayecto(1939, "Polonia");
        evt.añadirTrayecto(1940, "Francia");
        evt.añadirTrayecto(1945, "Alemania");
        
        System.out.println(evt);
    }
    
}
