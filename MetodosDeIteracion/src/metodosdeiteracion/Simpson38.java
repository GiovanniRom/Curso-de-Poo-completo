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
public class Simpson38 {
  public Funcion fun;

    public Simpson38() {
    }
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    public void metodoS38() throws JepException{
        double xi,r=0,h,var;
        int n=3;
        System.out.println("Introduzca la funcion a integrar\n");
        Scanner myObj = new Scanner(System.in);
        String cadena = myObj.nextLine();
        this.setFuncion(cadena);
        System.out.println("Introduzca el limite inferior\n");
        Scanner myObj1 = new Scanner(System.in);
        Double a= myObj1.nextDouble();
        System.out.println("Introduzca el limite superior\n");
        Scanner myObj2 = new Scanner(System.in);
        Double b = myObj2.nextDouble();
        
        h=(b-a)/n;
        for(int j=0;j<=n;j++){
            if(j==0){
                xi=a+j*h;
                var=this.fun.evaluar(xi);
                r=r+var;
            }
            else if(j==n){
                xi=a+j*h;
                var=this.fun.evaluar(xi);
                r=r+var;
            }
            else{
                xi=a+j*h;
                var=this.fun.evaluar(xi);
                r=r+3*var;
            }
        }
        Double w = 0.375;
        r=r*h*w;
        System.out.println("El resultado de la integral por metodo de Simpson 3/8 es: " + r +"\n");
    }  
}
