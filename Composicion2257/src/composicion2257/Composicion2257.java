/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author cakit
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muro muroNorte = new Muro();
        muroNorte.setPuerta(new Puerta("Madera", Color.white, true));
        Ventana[] tmpVentanas = new Ventana[2];
        tmpVentanas[0] = new Ventana("madera", Color.yellow, 0.5f, 1.0f);
        tmpVentanas[1] = new Ventana("madera", Color.green, 0.5f, 1.0f);
        muroNorte.setVentanas(tmpVentanas);
        
        System.out.println(muroNorte);
        System.out.println(muroNorte.getVentanas()[0]);
        System.out.println(muroNorte.getVentanas()[1]);
        muroNorte.getPuerta().setMaterial("aluminio");
        System.out.println(muroNorte);
        muroNorte.getVentanas()[1].setMaterial("aluminio");
        System.out.println(muroNorte.getVentanas()[1]);
        
        
        Muro murosur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, new Puerta("Aluminio", Color.white, false), null);
    }
    
}
