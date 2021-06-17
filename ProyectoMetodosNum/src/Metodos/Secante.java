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
public class Secante {
    double aux=0.0;
    double xi=0.0;
    int K;
    double erroR=.0;      
    double Yb =0.0;
    double fx0, fx1;
    DefaultTableModel    registrar;
    LeerFuncion ecuacion, derivadaecua;
    double intervaloa, intervalob;
    double errorIngreso;
    JTable table;
    double ciclos;

    public Secante(LeerFuncion ecuacion, double intervaloa, double intervalob, double errorIngreso, JTable table, double ciclos) {
        this.ecuacion = ecuacion;
        this.intervaloa = intervaloa;
        this.intervalob=intervalob;
        this.errorIngreso = errorIngreso;
        this.table = table;
        this.ciclos = ciclos;
    }
    
    public void secanteIter(double iteraciones){
        String[][] num = {};
        String [] numero={"i", "xi", "yi", "Error "};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        
             table.setModel(registrar);
     
        do {
               fx0 =ecuacion.ConvertirADouble(intervaloa);
                erroR = Math.abs(intervaloa - intervalob);
                Object[] fila = {
                    K,
                    intervaloa,
                         String.format("%10f",fx0),
                        String.format("%10f",erroR)
                };
                registrar.addRow(fila);
                fx1 = ecuacion.ConvertirADouble(intervalob);
                aux = intervalob;
                intervalob = intervalob - (((intervalob - intervaloa) / (fx1 - fx0)) * fx1);
                intervaloa = aux;
                K++;
            } while (K <= iteraciones);
         JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION :"+ (K-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
    }
        
    
    
    public void secanteRaiz(double raiz){
        String[][] num = {};
        String [] numero={"i", "xi", "yi", "Error "};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        
             table.setModel(registrar);
                fx0 =ecuacion.ConvertirADouble(intervaloa);
                erroR = Math.abs(intervaloa - intervalob);
     if(ecuacion.ConvertirADouble(raiz)!=0){
          JOptionPane.showMessageDialog(null, "LA RAIZ NO ES EXACTA",
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
     }else{
              while (erroR >= errorIngreso){
               fx0 =ecuacion.ConvertirADouble(intervaloa);
                erroR = Math.abs(intervaloa - intervalob);
                Object[] fila = {
                    K,
                    intervaloa,
                         String.format("%10f",fx0),
                        String.format("%10f",erroR)
                };
                registrar.addRow(fila);
                fx1 = ecuacion.ConvertirADouble(intervalob);
                aux = intervalob;
                intervalob = intervalob - (((intervalob - intervaloa) / (fx1 - fx0)) * fx1);
                intervaloa = aux;
                K++;
            }  
         JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION :"+ (K-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
     }
        
    }
    
    public void secanteErr(double error){
        String[][] num = {};
        String [] numero={"i", "xi", "yi", "Error "};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        table.setModel(registrar);
        fx0 =ecuacion.ConvertirADouble(intervaloa);
        erroR = Math.abs(intervaloa - intervalob);
        while (erroR >= error){
               fx0 =ecuacion.ConvertirADouble(intervaloa);
                erroR = Math.abs(intervaloa - intervalob);
                Object[] fila = {
                    K,
                    intervaloa,
                         String.format("%10f",fx0),
                        String.format("%10f",erroR)
                };
                registrar.addRow(fila);
                fx1 = ecuacion.ConvertirADouble(intervalob);
                aux = intervalob;
                intervalob = intervalob - (((intervalob - intervaloa) / (fx1 - fx0)) * fx1);
                intervaloa = aux;
                K++;
            }
         JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION :"+ (K-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }

