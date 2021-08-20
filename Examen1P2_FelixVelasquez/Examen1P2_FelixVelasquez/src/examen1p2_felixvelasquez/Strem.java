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
public class Strem extends Cine  {
    String nombre; 
    int precio; 
    String calificacion; 
    int fecha; 
    String empresa; 
    
     public Strem() {
    }

    public Strem(String nombre, int precio, String calificacion, int fecha, String empresa) {
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
     
    
}
