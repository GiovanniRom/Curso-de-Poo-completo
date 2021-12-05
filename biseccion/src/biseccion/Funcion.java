/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biseccion;
import com.singularsys.jep.JepException;
import org.nfunk.jep.JEP;
/**
 *
 * @author cakit
 */
public class Funcion {
    //Creamos la Variable para almacenar la función
    private String expresion = "";
    
    //Creamos un método que utilice la funcion como parametro
    public Funcion(String expresion){
        this.expresion = expresion;
    }
    
    //Creamos un método para evaluar nuestra función
    public double evaluar(double x) throws JepException{  
        
       //Creamos un objeto j de nuestra librería JEP
       JEP j = new JEP(); 
       
       //Utilizamos las funciones que nos da la Librería JEP para evaluar nuestro String de la función
       j.addStandardFunctions();
       j.addStandardConstants();
       j.addVariable("x", x);
       j.parseExpression(this.expresion);
       
        //Condicionamos en caso de que el resultado de la evalución de nuestro String de la funcion sea correcto y devolvemos el valor obtenido
        if (!j.hasError()) {
            return j.getValue();
        
        } else {
            return Double.NaN;
        }           
    }
}
