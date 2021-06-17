/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import org.nfunk.jep.TokenMgrError;

/**
 *
 * @author Usuario
 */
public class LeerFuncion {
    JEP  ECUA=new JEP();

    public LeerFuncion(String ecuacion) {
        ECUA.addVariable("x", 0);
        ECUA.addStandardConstants();
        ECUA.addStandardFunctions();
        ECUA.parseExpression(ecuacion);
        if(ECUA.hasError()){
            System.out.println("Error al leer funcion");
        }
    
    }
public double ConvertirADouble(double x){
    double e;
    ECUA.addVariable("x", x);
    e=ECUA.getValue();
    if(ECUA.hasError()){
        System.out.println(ECUA.getErrorInfo());
    }
    return e;
}    
    
    public String derivarfuncion(String Mf) {
        String derivar = "";
        DJep funcionderivada = new DJep();

        funcionderivada.addStandardFunctions();
        funcionderivada.addStandardConstants();
        funcionderivada.addComplex();
        funcionderivada.setAllowUndeclared(true);
        funcionderivada.setAllowAssignment(true);
        funcionderivada.setImplicitMul(true);
        funcionderivada.addStandardDiffRules();

        try {
            Node node = funcionderivada.parse(Mf);
            Node diff = funcionderivada.differentiate(node, "x");
            Node simp = funcionderivada.simplify(diff);
            derivar = funcionderivada.toString(simp);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Verifique todos los campos");
        }

        return derivar;
    }

}
