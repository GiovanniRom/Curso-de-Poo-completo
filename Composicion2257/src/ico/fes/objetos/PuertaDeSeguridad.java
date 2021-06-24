/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author cakit
 */
public class PuertaDeSeguridad extends Puerta{
    private String mecanismos;
    private String contrasenia;

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String mecanismos, String contrasenia) {
        this.mecanismos = mecanismos;
        this.contrasenia = contrasenia;
    }

    public PuertaDeSeguridad(String mecanismos, String contrasenia, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.mecanismos = mecanismos;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getMecanismos() {
        return mecanismos;
    }

    public void setMecanismos(String mecanismos) {
        this.mecanismos = mecanismos;
    }

    @Override
    public String toString() {
        return super.toString() + "PuertaDeSeguridad{" + "mecanismos=" + mecanismos + ", contrasenia=" + contrasenia + '}';
    }

    public boolean verificar(){
        System.out.println("Verificnado...");
        return this.contrasenia != null;
    }

    @Override
    public void abrir() {
        if(this.getContrasenia() == "1234dios"){
            System.out.println("Contraseña correcta...");
            super.abrir();
        }else{
            System.out.println("Contraseña invalida... verifique su contraseña");
        }
    }
    
    
    
}
