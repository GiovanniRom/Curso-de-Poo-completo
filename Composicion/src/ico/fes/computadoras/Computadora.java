/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadoras;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author cakit
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor pantalla;
    private CPU proce;
    private Mouse raton;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor pantalla, CPU proce, Mouse raton, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.proce = proce;
        this.raton = raton;
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public CPU getProce() {
        return proce;
    }

    public void setProce(CPU proce) {
        this.proce = proce;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", proce=" + proce + ", raton=" + raton + ", teclado=" + teclado + '}'+"\n";
    }
    
    

    
    
    
}
