/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.cuartos.Cuarto;
import ico.fes.objetos.Mesa;
import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
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
        
        
        Muro muroSur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, new Puerta("Aluminio", Color.white, false), null);
        
        //Ejemplo de habitacion aka tarea moral
        Cuarto habitacion1 = new Cuarto();
        habitacion1.setMesita(new Mesa("madera y metal", 1.3f));
        habitacion1.setMuroNorte(new Muro(2.0f, 2.0f, 2.0f, Color.white, new Puerta("madera", Color.white, false), tmpVentanas));
        habitacion1.setMuroSur(new Muro(2.0f, 2.0f, 2.0f, Color.white, null, tmpVentanas));
        habitacion1.setMuroEste(new Muro(2.0f, 2.0f, 2.0f, Color.white, null, tmpVentanas));
        habitacion1.setMuroOeste(new Muro(2.0f, 2.0f, 2.0f, Color.white, null, tmpVentanas));
        
        System.out.println("*****Implementacion de tarea moral de habitacion*****");
        System.out.println(habitacion1);
        
        System.out.println("*****Ejemplos de herencia*****");
        PuertaDeSeguridad puer1 = new PuertaDeSeguridad();
        puer1.abrir();
        puer1.cerrar();
        puer1.setColor(Color.gray);
        System.out.println("La puerta de seguridad es de color: "+puer1.getColor());
        
        PuertaDeSeguridad puer2 = new PuertaDeSeguridad("Chapa electronica", "1234dios", "metal", Color.gray, false);
        System.out.println(puer2.toString());
        
        
        System.out.println("**********Refundido***********");
        
        Puerta nueva = (Puerta)puer2;
        System.out.println(nueva);
        puer2.abrir();
        System.out.println("*****Lamado al metodo de la clase bsae");
        ((Puerta)puer2).abrir(); //algo cambio en el llamdo a los metodos despues de hacer un refundido
    }
    
}
