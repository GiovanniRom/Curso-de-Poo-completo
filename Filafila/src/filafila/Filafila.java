
package filafila;

import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class Filafila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice=0,opc =0,tam,dato,lugar=0;
    
   System.out.println("Ingrese el tamañlo de la Fila\n");
                Scanner myObjp = new Scanner(System.in);
                tam = myObjp.nextInt();
                int Fila[] = new int[tam];
        Scanner myObj = new Scanner(System.in);
          do{
        System.out.println("Lista de Fila\n-Que deseas hacer?\n1-Ingresar un elemento\n2-Sacar un elemento\n3-Imprimir contenido\n4-Salir");
       
        opc = myObj.nextInt();
        switch(opc){
            case 1:
                if(indice<tam){
                System.out.println("Ingrese el elemento que desea agregar\n");
                Scanner myObj1 = new Scanner(System.in);
                dato = myObj1.nextInt();
                Fila[indice]=dato; 
                indice++;}
                else
                    System.out.println("La Fila ya esta llena\n");
                break;
            case 2:
                if(indice==0)
                System.out.println("La Fila ya esta vacia\n");
                else{
                    for(int r=0;r<indice-1;r++)
                        Fila[r]=Fila[r+1];
                indice--;
                Fila[indice]=0;           
                } 
                break;
            case 3:
                int r = lugar;
                for(;r<indice;r++){
                    System.out.println(Fila[r]);
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
    
}