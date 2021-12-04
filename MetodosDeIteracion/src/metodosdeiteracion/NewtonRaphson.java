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
public class NewtonRaphson {

    public NewtonRaphson() {
    }
    
    public void metodoNR(int xc,int xl,int c,float i){
        float dxc,fnr; //derivadas de x cuadratica
        dxc=xc*2;
        
        for(int j=0;j<=10;j++){
            i=i-(((xc*i*i)+(xl*i)+c)/(dxc*i+xl));
        }
        System.out.println("La raiz por metodo de newton-raphson esta en:"+i+"\n");
    }
    
}
