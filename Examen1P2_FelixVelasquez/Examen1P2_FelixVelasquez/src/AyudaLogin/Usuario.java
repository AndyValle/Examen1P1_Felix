/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyudaLogin;

import java.util.Vector;

/**
 *
 * @author PERSONAL
 */
public class Usuario {
   private String nick;
   private String contra;
   private String rango;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getRango() {
        return rango;
    }
    public static int verificador (String usu){
        Vector lista = mostrar ();
        Usuario o;
        for (int i = 0 ; i < lista.size ();i++){
            o = (Usuario )lista.elementAt(i);
            if (o.getNick().equalsIgnoreCase(usu)){
                return i;
            }
        }
        return -1;
    }
    public static int verificador2 (String usu, String contra){
        Vector lista = mostrar ();
        Usuario o;
        for (int i = 0 ; i < lista.size ();i++){
            o = (Usuario )lista.elementAt(i);
            if (o.getNick().equalsIgnoreCase(usu)&& o.getContra ().equalsIgnoreCase(contra)){
                return i;
            }
        }
        return -1;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
      public static Vector mostrar(){
          return ListaUsuario.mostrar();
      }
}

