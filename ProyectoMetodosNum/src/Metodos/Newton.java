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
public class Newton {
         double rasolucion=0.0;
        double xi=0.0;
        double error=0.0;      
        double auxiliar =0.0;
        DefaultTableModel    registrar;
        LeerFuncion ecuacion, derivadaecua;
        double inicio;
        double errorIngreso;
        JTable table;
        double ciclos;

    public Newton(LeerFuncion ecuacion, LeerFuncion derivadaecua, double inicio, double errorIngreso, JTable table, double ciclos) {
        this.ecuacion = ecuacion;
        this.derivadaecua = derivadaecua;
        this.inicio = inicio;
        this.errorIngreso = errorIngreso;
        this.table = table;
        this.ciclos = ciclos;
    }
        
   public void metododenewtonIte(double cicloss){     

        String[][] num = {};
        String [] numero={"i", "xi", "yi", "f'(xi)", "error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
            int i = 0; 
            table.setModel(registrar);
            do{
                double yi= ecuacion.ConvertirADouble(inicio);
                double fxi=derivadaecua.ConvertirADouble(inicio);
                rasolucion=inicio;
                Object [] fila={
                       
                    i, 
                    inicio,
                        String.format("%10f", yi),
                         String.format("%10f",fxi),
                         String.format("%10f",error)
                } ;
                registrar.addRow(fila);   
                inicio= inicio- yi/fxi;
                xi=inicio;
                error=Math.abs(rasolucion-xi);
                rasolucion=inicio;
                i++;
            }while(i<=cicloss);
            JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION :"+ (i-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }
   
   public void metododenewtonErr(double errorIngresos){     

        String[][] num = {};
        String [] numero={"i", "xi", "yi", "f'(xi)", "error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
            int i = 0; 
            table.setModel(registrar);
            do{
                double yi= ecuacion.ConvertirADouble(inicio);
                double fxi=derivadaecua.ConvertirADouble(inicio);
                rasolucion=inicio;
                Object [] fila={
                       
                    i, 
                    inicio,
                        String.format("%10f", yi),
                         String.format("%10f",fxi),
                         String.format("%10f",error)
                } ;
                registrar.addRow(fila);   
                inicio= inicio- yi/fxi;
                xi=inicio;
                error=Math.abs(rasolucion-xi);
                rasolucion=inicio;
                i++;
            }while(error>=errorIngresos);
            JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION :"+ (i-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }
   
   
   public void Raiznewton(double raiz){     

        String[][] num = {};
        String [] numero={"i", "xi", "yi", "f'(xi)", "error"};
        registrar=new DefaultTableModel(num, numero){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        }; 
        if(ecuacion.ConvertirADouble(raiz)!=0){
            JOptionPane.showMessageDialog(null, "LA RAIZ NO ES EXACTA",
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int i = 0; 
            table.setModel(registrar);
            do{
                double yi= ecuacion.ConvertirADouble(inicio);
                double fxi=derivadaecua.ConvertirADouble(inicio);
                rasolucion=inicio;
                Object [] fila={
                       
                    i, 
                    inicio,
                       String.format("%10f", yi),
                         String.format("%10f",fxi),
                         String.format("%10f",error)
                } ;
                registrar.addRow(fila);   
                inicio= inicio- yi/fxi;
                xi=inicio;
                error=Math.abs(rasolucion-xi);
                rasolucion=inicio;
                i++;
            }while(error>=errorIngreso);
            JOptionPane.showMessageDialog(null, "LA RAIZ SE OBTUVO EN LA ITERACION: "+ (i-1),
                        "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }
        }
            
}
    
