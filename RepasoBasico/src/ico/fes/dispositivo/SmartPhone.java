/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivo;

/**
 *
 * @author GARM
 */
public class SmartPhone {
    private String marca;
    private String modelo;
    private String color;
    private float tamanio;

    public SmartPhone() {
    }

    public SmartPhone(String m, String mod, String c, float t) {
        this.marca = m;
        this.modelo = mod;
        this.color = c;
        this.tamanio = t;
    }

    public SmartPhone(String m) {
        this.marca = m;
    }
    
    public SmartPhone(String m, String mod) {
        this.marca = m;
        this.modelo = mod;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        System.out.println("Estableciendo nuevo valor");
        if(tamanio<=10 && tamanio>=3)
        this.tamanio = tamanio;
        else{
            System.out.println("El tamanio no es real");
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
    
    public boolean encender(){
        System.out.println("Encnediendo el equipo" + this.marca);
        return true;
    }
    
    /**
     * el metodo llamar simula el funcionamiento del programa del telefono
     * smartphone, esto gracias a la posibilidad de la abstraccion
     * @param numeroDestino Numero a llamar
     * @return int que representa el numero de minutos que duro la llmada.
     */
    
    
    public int llamar(int numeroDestino){
        System.out.println("Llamando al numero" + numeroDestino);
        return 60;
    }
    public void tomarFoto(){
        System.out.println("Tomando foto...");
    }
}
