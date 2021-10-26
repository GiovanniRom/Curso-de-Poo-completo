/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.elementos;

/**
 *
 * @author cakit
 */
public class Elemento {
    private int n;
    private int indice;
       private String txt;

    public Elemento() {
    }

    public Elemento(int n, int indice, String txt) {
        this.n = n;
        this.indice = indice;
        this.txt = txt;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
       


    
}
