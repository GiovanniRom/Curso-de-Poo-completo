/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeiteracion;

//import static java.lang.Math.sqrt;
import com.singularsys.jep.JepException;
import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class PuntoFijo {

    /**
     *
     */
    public Funcion fun;
    public PuntoFijo() {
    }
    
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    
    public void metodopf() throws JepException{
        Double r;
        System.out.println("Introduzca la funcion de ordenamiento\n");
        Scanner myObj = new Scanner(System.in);
        String cadena = myObj.nextLine();
        this.setFuncion(cadena);
         System.out.println("Introduzca el punto inicial\n");
        Scanner myObj1 = new Scanner(System.in);
        Double p = myObj1.nextDouble();
        this.setFuncion(cadena);
        for(int j=0;j<=25;j++){
            r=this.fun.evaluar(p);
            p=r;
        }
        System.out.println("La raiz por metodo de punto fijo esta en: "+p+"\n");
       
    }
    
}
