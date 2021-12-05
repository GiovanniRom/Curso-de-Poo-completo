/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeiteracion;
import com.singularsys.jep.JepException;
import java.util.Scanner;
/**
 *
 * @author cakit
 */
public class NewtonRaphson {
    public Funcion fun;
    public Funcion der;

    public NewtonRaphson() {
    }
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    public void setDerivada(String expresion){
        der = new Funcion(expresion);
    }
    public void metodoNR() throws JepException{
        Double r;
        System.out.println("Introduzca la funcion\n");
        Scanner myObj = new Scanner(System.in);
        String cadena = myObj.nextLine();
        this.setFuncion(cadena);
        System.out.println("Introduzca la derivada de la funcion\n");
        Scanner myObj1 = new Scanner(System.in);
        String derivada = myObj1.nextLine();
        this.setDerivada(derivada);
        System.out.println("Introduzca el punto inicial\n");
        Scanner myObj2 = new Scanner(System.in);
        Double p = myObj2.nextDouble();
        this.setDerivada(derivada);
        
        for(int j=0;j<=25;j++){
            r=p-(this.fun.evaluar(p)/this.der.evaluar(p));
            p=r;
        }
        System.out.println("La raiz por metodo de newton-raphson esta en:"+ p +"\n");
    }
    
}
