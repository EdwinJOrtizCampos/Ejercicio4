/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.model;

/**
 *
 * @author edwin
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int dia, int mes, int año){
        if(dia > 0 && dia < 32){
            this.dia = dia;
        }
        if(mes > 0 && mes < 13){
            this.mes = mes;
        }
        
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

}
