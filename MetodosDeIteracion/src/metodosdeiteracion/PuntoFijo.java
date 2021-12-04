/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeiteracion;

/**
 *
 * @author cakit
 */
public class PuntoFijo {

    public PuntoFijo() {
    }
    
    public void metodopf(int xc,int xl,int c, float p){
        float r, var,i;
        int j;
        if(xc==0){
            System.out.println("Esta forma no converge\n");
        }
        else{
            if(xl==0){
                var= -c/xc;       //separacion de x cuadrada en dos y simplificacion
                i=p;
                for(j=0;j<=25;j++){ //iteraciones de esa forma
                    r=var*(1/i);
                    //System.out.println("|"+i+"|"+r+"|\n");  //imprime los resultados de esa forma
                    i=r;
                }
                System.out.println("La raiz por metodo de punto fijo esta en:"+i+"\n");
            }else{
                if(c==0){
                //var=(-c-Axc/xl);       separacion y simplificacion de ecuacion
                i=p;
                for(j=0;j<=25;j++){     //iteraciones de esa forma
                    r=((-(xc)*(i)*(i))/xl);
                    //System.out.println("|"+i+"|"+r+"|\n");  //imprime los resultados de esa forma
                    i=r;
                }
                System.out.println("La raiz por metodo de punto fijo esta en:"+i+"\n");
                }else{
                    //var=-c/(Axc+xl)
                    i=p;
                    for(j=0;j<=25;j++){
                        r=-c/((xc*i)+xl);
                        //System.out.println("|"+i+"|"+r+"|\n");  //imprime los resultados de esa forma
                        i=r;
                    }
                    System.out.println("La raiz por metodo de punto fijo esta en:"+i+"\n");
                }
                
            }
        }
    }
    
}
