
package listaligada;
import java.util.Scanner;

public class Listaligada{
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int opc=0;
        System.out.println("Lista ligada simple\n");  
        do{
        System.out.println("1-introducir elemento\n2-borrar elemento\n3-imprimir contenido\n4-Insertar elemento\n 5-salir\n");
        Scanner myObjp = new Scanner(System.in);
        opc = myObjp.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Introduzca el valor\n");
                    Scanner myObj = new Scanner(System.in);
                    int elemento = myObj.nextInt();
                    lista.Agregarinicio(elemento);
                break;
                case 2:
                    lista.BorrarElemento();
                break;
                case 3:
                    lista.Mostrarlista();
                break;
                case 4:
                    lista.InsertarElemento();
                    break;
                case 5:
                    System.out.println("Fin del programa\n");
                    break;
                default:
                    System.out.println("Opcion invalida\n");
            }
        }
        while(opc!=5);
    }
    
    }

