/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.model;

import java.util.Objects;

/**
 *
 * @author edwin
 */
public class EventoHistorico {
    private String tipo;
    private String lugar;
    private String nombre;
    private String definicion;
    private Fecha fecha;
    private Galeria galeria;
    private Trayectoria trayectoria = null;
    
    public EventoHistorico(String tipo, String lugar, String nombre, 
            String definicion, Fecha fecha, Galeria galeria){
        this.tipo = tipo;
        this.lugar = lugar;
        this.nombre = nombre;
        this.definicion = definicion;
        this.fecha = fecha;
        this.galeria = galeria;
    }
    
        public EventoHistorico(String tipo, String lugar, String nombre, 
            String definicion, Fecha fecha, Galeria galeria,
            Trayectoria trayectoria){
            this.tipo = tipo;
            this.lugar = lugar;
            this.nombre = nombre;
            this.definicion = definicion;
            this.fecha = fecha;
            this.galeria = galeria;
            this.trayectoria = trayectoria;
    }
        
        public void añadirTrayecto(int año, String pais){
            if(!Objects.isNull(this.trayectoria) && año >= this.fecha.getAño()){
                this.trayectoria.añadir(año, pais);
            }
        }
        
        @Override
        public String toString(){
            if(!Objects.isNull(this.trayectoria)){
                return trayectoria.toString();
            }else{
                return "Sin trayectoria disponible";
            }            
        }    
}
