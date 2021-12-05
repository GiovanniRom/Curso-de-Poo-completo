/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeiteracion;
import com.singularsys.jep.JepException;
import java.util.Scanner;
//import java.util.Scanner;


/**
 *
 * @author cakit
 */
public class MetodosDeIteracion {
        
    /**
     * @param args the command line arguments
     * @throws com.singularsys.jep.JepException
     */ 
    public static void main(String[] args) throws JepException {
       int o; 
       float i=0;
       PuntoFijo pf = new PuntoFijo();
       NewtonRaphson nr = new NewtonRaphson();
       Biseccion bi = new Biseccion();
        
       /* System.out.println("Introduzca el coeficiente de x");
        Scanner myObj1 = new Scanner(System.in);
        xl = myObj1.nextInt();
        System.out.println("Introduzca el coeficiente de c");
        Scanner myObj2 = new Scanner(System.in);
        c = myObj2.nextInt();
        System.out.println("Introduzca el valor inicial de X0");
        Scanner myObj3 = new Scanner(System.in);
        i = myObj3.nextFloat();
        //metodo de punto fijo*/
      do{
          System.out.println("Que metodo desea utilizar\n1-Metodo de Biseccion\n2-Metodo de Punto Fijo\n3-Metodo de Newton-Rapson\n");
        Scanner myObj = new Scanner(System.in);
         o = myObj.nextInt();
       switch(o){
           case 1:
               bi.metodobi();
               break;
           case 2:
               pf.metodopf();
               break;
           case 3:
               nr.metodoNR();
               break;
           case 7:
               System.out.println("Fin del programa\n");
               break;
           default:
               System.out.println("Introduzaca una opcion valida\n");
       
    }
    }while(o!=7);
    }
    
}
