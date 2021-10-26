/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeligada;

/**
 *
 * @author cakit
 */
public class Nodo {
     public int dato;
    public Nodo sig;
    public Nodo ant;
    //Constructor para insertar al final
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor de inicio
    public Nodo(int d, Nodo s, Nodo a){
        dato =d;
        sig=s;
        ant=a;
    }
}
