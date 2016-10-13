
package boletin3_consumos;

import javax.swing.JOptionPane;


public class Boletin3_consumos {

    
    public static void main(String[] args) {
        Consumos consumo1= new Consumos();
        consumo1.setlitros(50f);
        consumo1.setprecioGasoil(1.57f);
        
        
        Consumos consumo2= new Consumos(1000f,50f,40f,1.57f);
        float l=consumo2.getlitros();
        float km=consumo2.getkilometros();
        float consumoMedio=consumo2.calcular_consumoMedio(l,km);
        System.out.println("consumo medio = "  + consumoMedio );
        System.out.println("consumo medio= " + consumo2.calc_conMedio());
        System.out.println("consumo medio= " + consumo2.calcular_consumoMedio(consumo2.getlitros(), consumo2.getkilometros()));
        
        System.out.println("Consumo euros = " + consumo2.calcular_consumoEuros() );
        
        
       //exemplo 1
       l=Float.parseFloat(JOptionPane.showInputDialog("Introduza os litros ="));
       consumo2.setlitros(l);
       System.out.println(" Novo valor litros = " + consumo2.getlitros() );
       //exemplo2
       consumo2.setlitros(Float.parseFloat(JOptionPane.showInputDialog("Introduza os litros =")));
       System.out.println(" Novo valor litros = " + consumo2.getlitros() );    
 
        consumo2.getvelocidadeMedia();
        System.out.println( "velocidade media = " + consumo2.getvelocidadeMedia());
       
       
        }
    }
    

