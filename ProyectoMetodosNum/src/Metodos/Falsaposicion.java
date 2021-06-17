/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 * 
 */
public class Falsaposicion {
        double Yi;
        double Ys;
        double error;      
        DefaultTableModel    registrar;
        LeerFuncion F;
         double errorIngreso;
        JTable table;
        double ciclos;

    public Falsaposicion( LeerFuncion F,double a, double b, double error, JTable table, double ciclos) {
        this.Yi = a;
        this.Ys = b;
        this.error = error;
        this.F = F;
        this.table = table;
        this.ciclos = ciclos;
    }
        
        
        
        
     public void FalsaPosicionIte(double iteracion){     
        double FYI=F.ConvertirADouble(Yi);
        double FYS=F.ConvertirADouble(Ys);
        double XK=0;
        int i=1;
        double Aux=0.0;
        double Err;
        double c=0.0;
        double Xk=Yi;              
        String[][] Registro = {};
        String [] datos={"i", "a", "b", "x ", "f(a)", "f(b)", "f(x)", "Error"};
        DefaultTableModel    In=new DefaultTableModel(Registro, datos){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        if((FYI*FYS)<0){
            do{
                Aux=Yi;
                 Xk=Yi-((Ys-Yi)/(FYS-FYI)*FYI);
                 c=Xk;
                 Err=Math.abs(Aux-c);
                XK=F.ConvertirADouble(Xk);
                table.setModel(In); 
                Object [] Lista={
                    String.valueOf(i), 
                    String.valueOf(Yi),
                    String.valueOf(Ys), 
                    String.format("%.10f", Xk),
                    String.format("%.10f", FYI), 
                    String.format("%.10f", FYS),
                    String.format("%.10f", XK), 
                    i != 1 ? String.format("%.20f", Err) : "0.0"
              
                } ;
                In.addRow(Lista); 
              
                if((FYI*XK)<0){
                    Ys=Xk;
                    FYS=XK;
                }else{
                    Yi=Xk;
                    FYI=XK;
                }
                i++;
            }while(i<=iteracion);
            JOptionPane.showMessageDialog(
                    null, "LA RAIZ SE OBTUVO EN LA RAIZ : " + (i-1) ,
                    "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
             
            }else{
            JOptionPane.showMessageDialog(null, "INGRESE OTRO INTERVALO", "ERROR",JOptionPane.ERROR_MESSAGE);
        }   
}
    
     public void FalsaPosicionError(double errorr){     
        double FYI=F.ConvertirADouble(Yi);
        double FYS=F.ConvertirADouble(Ys);
        double XK=0;
        int i=1;
        double Aux=0.0;
        double Err;
        double c=0.0;
        double Xk=Yi;              
        String[][] Registro = {};
        String [] datos={"i", "a", "b", "x ", "f(a)", "f(b)", "f(x)", "Error"};
        DefaultTableModel    In=new DefaultTableModel(Registro, datos){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        if((FYI*FYS)<0){
            do{
                Aux=Yi;
                 Xk=Yi-((Ys-Yi)/(FYS-FYI)*FYI);
                 c=Xk;
                 Err=Math.abs(Aux-c);
                XK=F.ConvertirADouble(Xk);
                table.setModel(In); 
                Object [] Lista={
                    String.valueOf(i), 
                    String.valueOf(Yi),
                    String.valueOf(Ys), 
                    String.format("%.10f", Xk),
                    String.format("%.10f", FYI), 
                    String.format("%.10f", FYS),
                    String.format("%.10f", XK), 
                    i != 1 ? String.format("%.20f", Err) : "0.0"
              
                } ;
                In.addRow(Lista); 
              
                if((FYI*XK)<0){
                    Ys=Xk;
                    FYS=XK;
                }else{
                    Yi=Xk;
                    FYI=XK;
                }
                i++;
            }while(Err>=errorr );
            JOptionPane.showMessageDialog(
                    null, "LA RAIZ SE OBTUVO EN LA RAIZ : " + (i-1) ,
                    "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
             
            }else{
            JOptionPane.showMessageDialog(null, "INGRESE OTRO INTERVALO", "ERROR",JOptionPane.ERROR_MESSAGE);
        }   
}
    public void FalsaPosicionRaiz(double raiz) {
        try {
            int cont = 1;
            double Fun = 0;
            double FYA = 0;
            double FDun = 0;
            double FYB = 0;
            double errorResult = 0;
            double aux = 0;
            DefaultTableModel model;
            String[][] datos = {};
            String[] nombre_columnas = {"i", "a", "b", "Xi", "f(a)", "f(b)", "f(Xi)", "Error"};
            model = new DefaultTableModel(datos, nombre_columnas) {
                @Override
                public boolean isCellEditable(int i, int i1) {
                    return false;
                }

            };
            table.setModel(model);
            FYA = F.ConvertirADouble(Yi);
            FYB = F.ConvertirADouble(Ys);
            Fun = ((Yi * FYB) - (Ys * FYA)) / (FYB - FYA);
            FDun = F.ConvertirADouble(Fun);
            errorResult = Math.abs(raiz - Fun);
            aux = F.ConvertirADouble(raiz);
            if (aux == 0) {
                while (errorResult >= error) {
                    FYA = F.ConvertirADouble(Yi);
                    FYB = F.ConvertirADouble(Ys);
                    Fun = ((Yi * FYB) - (Ys * FYA)) / (FYB - FYA);
                    FDun = F.ConvertirADouble(Fun);
                    errorResult = Math.abs(raiz - Fun);
                    Object[] fila = {
                        cont,
                        Yi,
                        Ys,
                        String.format("%10f", Fun),
                        String.format("%10f", FYA),
                        String.format("%10f", FYB),
                        String.format("%10f", FDun),
                        String.format("%20f", errorResult)};
                    if (FDun < 0) {
                        Yi = Fun;
                    } else {
                        Ys = Fun;
                    }
                    model.addRow(fila);
                    cont++;
                }
                JOptionPane.showMessageDialog(
                        null, "LA RAIZ ESTA LOCALIZADA EN LA  ITERACION "+(cont-1),
                        "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "LA RAIZ NO ES EXACTA",
                        "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
}
