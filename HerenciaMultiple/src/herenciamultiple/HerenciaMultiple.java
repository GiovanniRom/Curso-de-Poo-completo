/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiple;

import ico.fes.programacion.ProfesorDeProgramacion;

/**
 *
 * @author cakit
 */
public class HerenciaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProfesorDeProgramacion profe = new ProfesorDeProgramacion(20, "java", "ingenieria en computacion", 20, "jesus", 45);
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probarCodigo();
        System.out.println(profe);
    }
    
}
