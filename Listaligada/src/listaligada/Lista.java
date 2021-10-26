/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class Lista {
    int i=0;
    public Nodo inicio,fin;//punterode inicio y fin de lista  
    public Lista(){
        inicio=null;
        fin=null;
    }
    public void Agregarinicio(int dato){
        if(inicio==null&&fin==null){
            fin = new Nodo(dato, fin);
            inicio=fin;
        }
        else{
            Nodo aux=fin;
            fin = new Nodo(dato, fin);
            aux.sig=fin;
            aux=fin;           
        }
        i++;
    }
    public void Mostrarlista(){
        Nodo aux = inicio;
       for(int c=0;c<i;c++){
            System.out.print("["+aux.dato+"]->");
            aux=aux.sig;
        }   
}
    public void BorrarElemento(){
         System.out.println("Que datos desea borrar\n");
         Scanner myObjp = new Scanner(System.in);
         int ele = myObjp.nextInt();
         Nodo aux = inicio;
         Nodo auxant=inicio;   
     int o=i;
       for(int c=0;c<o;c++){//aqui i se retrolaimento con c
          if(aux.dato==ele){
              if(aux==inicio){
                  inicio=inicio.sig;
                  aux=inicio;
                  auxant=inicio;
                  i--;
              }else{ 
                  aux=aux.sig;
                  auxant.sig=aux;
                  i--;
              }
          }else{
              auxant=aux;
              aux=aux.sig;
          }
              
       }
       
    }
    
    public void InsertarElemento(){
        i++;
        System.out.println("En que posicion desea insertar el nuevo elemento?\n");
        Scanner myObjp = new Scanner(System.in);
         int indice = myObjp.nextInt();
         System.out.println("Que dato desea insertar?\n");
         Scanner myObjp1 = new Scanner(System.in);
         int dato = myObjp1.nextInt();
        Nodo aux1= inicio;
        Nodo auxant1= aux1;
        for(int j=0;i<=indice;i++){
            if(j==indice){
              auxant1 = new Nodo(dato, aux1); 
             }
        aux1 =aux1.sig;
        j++;
    }
    }
}

