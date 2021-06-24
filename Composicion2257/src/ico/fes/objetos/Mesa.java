/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

/**
 *
 * @author cakit
 */
public class Mesa {
    private String material;
    private float altura;

    public Mesa() {
    }

    public Mesa(String material, float altura) {
        this.material = material;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Mesa{" + "material=" + material + ", altura=" + altura + '}';
    }
    
    
    
}
