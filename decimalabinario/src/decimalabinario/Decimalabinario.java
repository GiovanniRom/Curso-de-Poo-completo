/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalabinario;

/**
 *
 * @author cakit
 */
public class Decimalabinario {
    private float n=0.33f;
    private String binario;
    private float buff=0.5f;

    public Decimalabinario() {
    }

    public Decimalabinario(String binario) {
        this.binario = binario;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(n>=0.0f){
            
        }
        
    }

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public float getBuff() {
        return buff;
    }

    public void setBuff(float buff) {
        this.buff = buff;
    }
    
}
