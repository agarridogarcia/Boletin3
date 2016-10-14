
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
        //calcular consumo medio
        System.out.println("consumo medio= " + consumo2.calcular_consumoMedio(consumo2.getlitros(), consumo2.getkilometros()));
        //calcular consumo en euros
        System.out.println("Consumo euros = " + consumo2.calcular_consumoEuros() );
        
        
       //variar os litros consumidos no obxecto 2
       consumo2.setlitros(Float.parseFloat(JOptionPane.showInputDialog("Introduza os litros =")));
          
       consumo2.visualizar();
       
      //visualiza a velocidade media do obxecto 2
      consumo2.getvelocidadeMedia();
       System.out.println( "velocidade media = " + consumo2.getvelocidadeMedia());
       
       
        }
    }
    

