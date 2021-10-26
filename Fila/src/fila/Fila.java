
package fila;

import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class Fila {
    
    private int n;
    private int ind;

    public Fila() {
    }

    public Fila(int n, int ind) {
        this.n = n;
        this.ind = ind;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice=0,opc =0,tam,dato;
    
   System.out.println("Ingrese el tamañlo de la Pila\n");
                Scanner myObjp = new Scanner(System.in);
                tam = myObjp.nextInt();
                int Pila[] = new int[tam];
        Scanner myObj = new Scanner(System.in);
          do{
        System.out.println("Lista de pila\n-Que deseas hacer?\n1-Ingresar un elemento\n2-Sacar un elemento\n3-Imprimir contenido\n4-Salir");
       
        opc = myObj.nextInt();
        switch(opc){
            case 1:
                if(indice<tam){
                System.out.println("Ingrese el elemento que desea agregar\n");
                Scanner myObj1 = new Scanner(System.in);
                dato = myObj1.nextInt();
                Pila[indice]=dato; 
                indice++;}
                else
                    System.out.println("La pila ya esta llena\n");
                break;
            case 2:
                if((indice-1)>=0){
                Pila[indice-1]=0;
                indice--;}
                else
                    System.out.println("La pila ya esta vacia\n");
                break;
            case 3:
                for(int r=0;r<indice;r++){
                    System.out.println(Pila[r]);
                }
                break;
            case 4:
                System.out.println("Fin del programa\n");
                break;
            default:
                System.out.println("Opcion no valida\n");
        }
    }
    while(opc!=4);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }
    
    
}
