/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.model;
import java.util.HashMap;
/**
 *
 * @author edwin
 */
public class Trayectoria {
    private final HashMap<Integer,String> trayectoria;
    
    public Trayectoria(){
        this.trayectoria = new HashMap<Integer,String>();
    }
    
    public void añadir(int año, String pais){
        trayectoria.put(año, pais);
    }
    
    @Override
    public String toString(){
        String res = "";
        for (Integer año:trayectoria.keySet()) {
            res += "año " + año + ": " + trayectoria.get(año) + "\n";  
        }
        return res;
    }
}
