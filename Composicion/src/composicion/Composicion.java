/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.computadoras.Computadora;

/**
 *
 * @author cakit
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora ordenador = new Computadora();
        ordenador.setMarca("Gigabyte");
        ordenador.setModelo("Cooler Master");
        ordenador.setPantalla(new Monitor("Dell","Px28",28));
        ordenador.setProce(new CPU("Intel","I5 4460", 3));
        ordenador.setRaton(new Mouse("Logitech","G502","alambrico"));
        ordenador.setTeclado(new Teclado("Logitech","K120",104,0));
        
        System.out.println(ordenador);
    }
    
}
