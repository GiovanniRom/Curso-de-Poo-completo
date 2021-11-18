/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeiteracion;
import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class MetodosDeIteracion {
        
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
       int xc=0,xl=0,c=0, i=0;
       PuntoFijo pf = new PuntoFijo();
        System.out.println("Introduzca el coeficiente de x^2");
        Scanner myObj = new Scanner(System.in);
        xc = myObj.nextInt();
        System.out.println("Introduzca el coeficiente de x");
        Scanner myObj1 = new Scanner(System.in);
        xl = myObj1.nextInt();
        System.out.println("Introduzca el coeficiente de c");
        Scanner myObj2 = new Scanner(System.in);
        c = myObj2.nextInt();
        System.out.println("Introduzca el valor inicial de X0");
        Scanner myObj3 = new Scanner(System.in);
        i = myObj3.nextInt();
        //metodo de punto fijo
        pf.metodopf(xc, xl, c, i);
        
    }
    
}
