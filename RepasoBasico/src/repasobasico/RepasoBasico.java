/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivo.SmartPhone;
import ico.fes.inegi.Encuestadorinegi;

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
        SmartPhone cell3 = new SmartPhone("Apple", "Iphone 8 plus");
        SmartPhone cell4 = new SmartPhone();
        System.out.println(cell);
        System.out.println(cell2);
        System.out.println(cell3);
        System.out.println(cell4);
        
        //Uso de metodos de acceso
        cell.setModelo("Galaxy Note 10");
        System.out.println(cell);
        
        System.out.println("Marca del cel:" +cell.getMarca());
        
        cell.setTamanio(156f);
        System.out.println(cell);
        
        Encuestadorinegi enc1 = new Encuestadorinegi();
        enc1.setDispositivo(cell4);
    }
    
}
