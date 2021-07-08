/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nrarray;


import javax.swing.JOptionPane;

/**
 *
 * @author JUAN
 */
public class NRArray {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int []arreglo = new int[11];
        int []contador = new int[11];
        String dato;
        
        String buscar;
        int detectar = 0;
        
        
        
        for (int i=0; i<arreglo.length; i++){
            dato = JOptionPane.showInputDialog( "Ingrese dato Numero "+ ( i + 1 ) );
            
            arreglo[ i ] = Integer.parseInt( dato );
            
            arreglo[ i ] = i;  
        }
        
        
        
        
        for (int i=0; i<arreglo.length; i++){
            contador[arreglo[i]]+=1;
        }
       
        
        for (int j=0; j<contador.length;j++){
           
            System.out.println("El numero "+j+" se repite "+contador[j]+" veces");
            
            
        }
        
        
        buscar = JOptionPane.showInputDialog( "Ingrese el numero a buscar ");
        for (int i=0; i<arreglo.length; i++){
            
            detectar = Integer.parseInt(buscar);
            arreglo[i]=detectar;   
        }
        
        for (int i=0; i<arreglo.length; i++){
            if(detectar == i){
                JOptionPane.showMessageDialog(null,"El numero "+i+" se repite "+contador[i]+" veces");
            }
           
        }       
    }
}

   
    

