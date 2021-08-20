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
public class MiniSerie extends Cine   {
     String nombre; 
    int tem; 
    String genero; 
    int tiempo; 
    String descri; 
    public MiniSerie(){
        
    }
    

    public MiniSerie(String nombre, int tem, String genero, int tiempo, String descri) {
        this.nombre = nombre;
        this.tem = tem;
        this.genero = genero;
        this.tiempo = tiempo;
        this.descri = descri;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    
    
}
