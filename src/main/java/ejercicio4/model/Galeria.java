/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.model;

import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class Galeria {
    private ArrayList<Contenido> contenido;
    
    public Galeria(ArrayList<Contenido> contenido){
        this.contenido = contenido;
    }
    
    public Galeria(){
        this.contenido = new ArrayList<Contenido>();
    }
    
    public void insertar(Contenido c){
        contenido.add(c);
    }
    
    public void mostrar(){
        for(Contenido c:this.contenido){
            c.mostrar();
        }
    }
}
