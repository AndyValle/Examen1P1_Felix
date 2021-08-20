
package examen1p2_felixvelasquez;

public class Peliculas  {
    
    String nombre; 
    int duracion; 
    String fechacine; 
    int fechaest; 
    String descri; 
    public Peliculas(){
        
    }

    public Peliculas(String nombre, int duracion, String fechacine, int fechaest, String descri) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechacine = fechacine;
        this.fechaest = fechaest;
        this.descri = descri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFechacine() {
        return fechacine;
    }

    public void setFechacine(String fechacine) {
        this.fechacine = fechacine;
    }

    public int getFechaest() {
        return fechaest;
    }

    public void setFechaest(int fechaest) {
        this.fechaest = fechaest;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    
    
    
}
