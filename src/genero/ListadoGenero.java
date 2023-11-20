/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genero;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class ListadoGenero {
    ArrayList<Genero> lista;

    public ListadoGenero() {
        this.lista = new ArrayList<Genero>();
    }
    
    public void agregarGenero(Genero g){
        lista.add(g);
    }
    
    
}
