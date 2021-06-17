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
 */
public class Biseccion {
       double Ya=0.0;
        double xi=0.0;
        double error=0.0;      
        double Yb =0.0;
        DefaultTableModel    registrar;
        LeerFuncion ecuacion, derivadaecua;
        double intervaloa, intervalob;
        double errorIngreso;
        JTable table;
        double ciclos;
 

    public Biseccion(LeerFuncion ecuacion, double intervaloa, double intervalob, double errorIngreso, JTable table, double ciclos) {
        this.ecuacion = ecuacion;
        this.intervaloa = intervaloa;
        this.intervalob = intervalob;
        this.errorIngreso = errorIngreso;
        this.table = table;
        this.ciclos = ciclos;
    }
      public void BiseccionIter(double itera){
           String[][] num = {};
        String [] numero={"I", "A", "B", "Xi", "F(B)", "F(B)", "F(Xi) ",  "Error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
       
     
             table.setModel(registrar);
           
        if ((ecuacion.ConvertirADouble(intervaloa)*ecuacion.ConvertirADouble(intervalob))>0)
            JOptionPane.showMessageDialog(null, "INTENTE CON OTROS INTERVALOS",
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else {
            
           
            int contador = 1;
            //hacemos el ciclo con el fin de buscar raices
            do{
                double Xm = (intervaloa+intervalob)/2;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
            double Ym = ecuacion.ConvertirADouble(Xm);
              error=Math.abs(intervalob-intervaloa);
               Object [] fila={
                       
                    contador, 
                    intervaloa,
                    intervalob,
                    Xm,
                         String.format("%10f",Ya),
                         String.format("%10f",Yb),
                         String.format("%10f",Ym),
                         String.format("%10f",error)
                } ;
                  if((Ya*Ym)>0){
                intervaloa = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            } else {
                intervalob = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            }
                  contador++;
                registrar.addRow(fila);     
            }while(contador<=itera);
            JOptionPane.showMessageDialog(null, "LA RAIZ ESTA EN LA ITERACION  "+(contador-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
      }
      }
      public void RaizBiseccion(double raiz){
           String[][] num = {};
        String [] numero={"I", "A", "B", "Xi", "F(B)", "F(B)", "F(Xi) ",  "Error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
       
     
             table.setModel(registrar);
           
        if (ecuacion.ConvertirADouble(raiz)!=0){
           JOptionPane.showMessageDialog(null, "INTENTE CON UNA RAIZ EXACTA",
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }else {
            
           
            int contador = 1;
            //hacemos el ciclo con el fin de buscar raices
            do{
                double Xm = (intervaloa+intervalob)/2;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
            double Ym = ecuacion.ConvertirADouble(Xm);
              error=Math.abs(intervalob-intervaloa);
               Object [] fila={
                       
                    contador, 
                    intervaloa,
                    intervalob,
                    Xm,
                        String.format("%10f", Ya),
                         String.format("%10f",Yb),
                         String.format("%10f",Ym),
                         String.format("%10f",error)
                } ;
                  if((Ya*Ym)>0){
                intervaloa = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            } else {
                intervalob = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            }
                  contador++;
                registrar.addRow(fila);     
            }while(error>=errorIngreso);
                  JOptionPane.showMessageDialog(null, "LA RAIZ ESTA EN LA ITERACION   "+(contador-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
      } 
      }
      public void BiseccionErr(double eerror){
           String[][] num = {};
        String [] numero={"I", "A", "B", "Xi", "F(B)", "F(B)", "F(Xi) ",  "Error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
       
     
             table.setModel(registrar);
           
        if ((ecuacion.ConvertirADouble(intervaloa)*ecuacion.ConvertirADouble(intervalob))>0)
            JOptionPane.showMessageDialog(null, "INTENTE CON OTROS INTERVALOS",
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
        else {
            
           
            int contador = 1;
            //hacemos el ciclo con el fin de buscar raices
            do{
                double Xm = (intervaloa+intervalob)/2;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
            double Ym = ecuacion.ConvertirADouble(Xm);
              error=Math.abs(intervalob-intervaloa);
               Object [] fila={
                       
                    contador, 
                    intervaloa,
                    intervalob,
                    Xm,
                         String.format("%10f",Ya),
                         String.format("%10f",Yb),
                         String.format("%10f",Ym),
                         String.format("%10f",error)
                } ;
                  if((Ya*Ym)>0){
                intervaloa = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            } else {
                intervalob = Xm;
                Ya =ecuacion.ConvertirADouble(intervaloa) ;
             Yb = ecuacion.ConvertirADouble(intervalob);
             Xm=(intervalob-intervaloa)/2;
             Ym=ecuacion.ConvertirADouble(Xm);
            }
                  contador++;
                registrar.addRow(fila);     
            }while(error>=eerror);
            JOptionPane.showMessageDialog(null, "LA RAIZ ESTA EN LA ITERACION  "+(contador-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
      }
      }  
    
}
