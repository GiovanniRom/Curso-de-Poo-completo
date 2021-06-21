/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2257;

import ico.fes.personas.Alumnos;
import ico.fes.personas.Persona;

/**
 *
 * @author cakit
 */
public class Herencia2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona candidato = new Persona("Jose Luis", 22, 0, 1.78f);
        
        Alumnos estudiante = new Alumnos("2021621", "Ingenieria en Computacion", 1, "Pedro Fulgencio", 23, 0, 1.65f);
        
        System.out.println("Un candidato a alumno es: "+ candidato);
        System.out.println("Un alumno ya registrado es: "+ estudiante);
    }
    
}
