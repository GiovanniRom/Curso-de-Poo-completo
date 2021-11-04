/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeligada;

import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class Listadoble {
    int i=0;
    public Nodo inicio,fin;//punterode inicio y fin de lista  
    public Listadoble(){
        inicio=null;
        fin=null;
    }
   public void Agregarinicio(int dato){
        if(inicio==null&&fin==null){
            fin = new Nodo(dato, fin,inicio);
            inicio=fin;
        }
        else{
            Nodo aux=fin;
            fin = new Nodo(dato, fin,aux);
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
       for(int c=0;c<o;c++){
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
        Nodo aux2= inicio;
        Nodo auxsig2=inicio.sig;
        Nodo auxant2= aux2;
        for(int j=0;j<=indice+1;j++){
            if(j==indice){
                if(j==0){
                    inicio=new Nodo(dato,aux2,null);
                }else{
              auxant2.sig = new Nodo(dato, auxsig2,auxant2); 
             }
            auxant2=aux2;
        aux2 =aux2.sig;
        auxsig2=aux2.sig;
    }
    }
}
}
