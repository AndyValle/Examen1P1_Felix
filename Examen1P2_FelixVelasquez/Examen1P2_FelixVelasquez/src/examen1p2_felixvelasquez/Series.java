/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixvelasquez;

/**
 *
 * @author PERSONAL
 */
public class Series extends Cine   {
    String nombre; 
    int tem; 
    String cali; 
    int ano; 
    String actores; 
    public Series(){
    
}

    public Series(String nombre, int tem, String cali, int ano, String actores) {
        this.nombre = nombre;
        this.tem = tem;
        this.cali = cali;
        this.ano = ano;
        this.actores = actores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public String getCali() {
        return cali;
    }

    public void setCali(String cali) {
        this.cali = cali;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

   
   
    
    
}
