/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.cuartos;

import ico.fes.objetos.Mesa;
import ico.fes.partes.Muro;

/**
 *
 * @author cakit
 */
public class Cuarto {
    private Muro muroNorte;
    private Muro muroSur;
    private Muro muroOeste;
    private Muro muroEste;
    private Mesa mesita;

    public Cuarto() {
    }

    public Cuarto(Muro muroNorte, Muro muroSur, Muro muroOeste, Muro muroEste, Mesa mesita) {
        this.muroNorte = muroNorte;
        this.muroSur = muroSur;
        this.muroOeste = muroOeste;
        this.muroEste = muroEste;
        this.mesita = mesita;
    }

    public Mesa getMesita() {
        return mesita;
    }

    public void setMesita(Mesa mesita) {
        this.mesita = mesita;
    }

    public Muro getMuroSur() {
        return muroSur;
    }

    public void setMuroSur(Muro muroSur) {
        this.muroSur = muroSur;
    }

    public Muro getMuroOeste() {
        return muroOeste;
    }

    public void setMuroOeste(Muro muroOeste) {
        this.muroOeste = muroOeste;
    }

    public Muro getMuroEste() {
        return muroEste;
    }

    public void setMuroEste(Muro muroEste) {
        this.muroEste = muroEste;
    }

    public Muro getMuroNorte() {
        return muroNorte;
    }

    public void setMuroNorte(Muro muroNorte) {
        this.muroNorte = muroNorte;
    }

    @Override
    public String toString() {
        return "Cuarto{" + "muroNorte=" + muroNorte + ", muroSur=" + muroSur + ", muroOeste=" + muroOeste + ", muroEste=" + muroEste + ", mesita=" + mesita + '}';
    }
    
    
    
}
