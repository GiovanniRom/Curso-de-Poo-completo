/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivo.SmartPhone;

/**
 *
 * @author cakit
 */
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SmartPhone cell = new SmartPhone("Samsung");
        SmartPhone cell2 = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
         System.out.println(cell);
        System.out.println(cell2);
        //hola 
    }
    
}
