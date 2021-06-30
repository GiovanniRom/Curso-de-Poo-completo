/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.programacion;

/**
 *
 * @author cakit
 */
public class ProfesorDeProgramacion extends Profesor implements Programador{
    private int anosExperiencia;
    private String lenguajeDeProgramcion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int anosExperiencia, String lenguajeDeProgramcion) {
        this.anosExperiencia = anosExperiencia;
        this.lenguajeDeProgramcion = lenguajeDeProgramcion;
    }

    public ProfesorDeProgramacion(int anosExperiencia, String lenguajeDeProgramcion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.anosExperiencia = anosExperiencia;
        this.lenguajeDeProgramcion = lenguajeDeProgramcion;
    }

    public ProfesorDeProgramacion(int anosExperiencia, String lenguajeDeProgramcion, String carrera, int antiguedad, String nombre, int edad) {
        super(carrera, antiguedad, nombre, edad);
        this.anosExperiencia = anosExperiencia;
        this.lenguajeDeProgramcion = lenguajeDeProgramcion;
    }

    public String getLenguajeDeProgramcion() {
        return lenguajeDeProgramcion;
    }

    public void setLenguajeDeProgramcion(String lenguajeDeProgramcion) {
        this.lenguajeDeProgramcion = lenguajeDeProgramcion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorDeProgramacion{" + "anosExperiencia=" + anosExperiencia + ", lenguajeDeProgramcion=" + lenguajeDeProgramcion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en: "+ this.lenguajeDeProgramcion);
        return 2;
    }

    @Override
    public void probarCodigo() {
        System.out.println("Probando programas en: " + this.lenguajeDeProgramcion);
    }
    
    
    
}
