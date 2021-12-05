/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biseccion;

import com.singularsys.jep.JepException;
import java.util.Scanner;

/**
 *
 * @author cakit
 */
public class Biseccion {

     public static void main(String[] args) throws JepException {
         String cadena;
        
        //Creamos un Objeto en metodo dónde deasrrollamos la lógica del Método de Bisección.
        Metodo metodo = new Metodo();
    
    //Utilizamos nuestro Objeto metodo con el Método .SetFuncion para ingresar la función como String 
    System.out.println("Introduzca la funcion\n");
        Scanner myObj = new Scanner(System.in);
        cadena = myObj.nextLine();
        metodo.setFuncion(cadena);
    
        //Aplicamos la Lógica del Método de Bisección con el Objeto metodo y el Método .biseccion
        //Gracias a que tenemos un Constructor el Método metodo.biseccion nos va a pedir los valores del Límite Inferior, Límite Superior y el Número de Decimales para la Raíz.
        System.out.println("Introduzca el limite inferior\n");
        Scanner myObj1 = new Scanner(System.in);
        double a = myObj1.nextFloat();
        System.out.println("Introduzca el limite superior\n");
        Scanner myObj2 = new Scanner(System.in);
        double b = myObj2.nextFloat();
        System.out.println("x: " + metodo.biseccion(a, b, 0.001));           
         
    }
    
}
