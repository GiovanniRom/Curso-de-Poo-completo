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
public class Simpson13 {
    public Funcion fun;

    public Simpson13() {
    }
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    public void metodoS13() throws JepException{
        double xi,r=0,h,var;
        int n;
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
        do{
        System.out.println("Introduzca el numero de intervalos, debe ser par\n");
        Scanner myObj3 = new Scanner(System.in);
        n = myObj3.nextInt();
        }while((n%2)!=0);
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
            else if((j%2)!=0){
                xi=a+j*h;
                var=this.fun.evaluar(xi);
                r=r+4*var;
            }
            else if((j%2)==0){
                xi=a+j*h;
                var=this.fun.evaluar(xi);
                r=r+2*var;
            }
        }
        r=r*(h/3);
        System.out.println("El resultado de la integral por metodo de Simpson 1/3 es: " + r +"\n");
    }
}
