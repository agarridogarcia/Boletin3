
package boletin3_consumos;

public class Consumos {
   //declaro atributos
    private float kilometros, litros, velocidadeMedia, precioGasoil;
    //constructores
    public Consumos(){
        kilometros=0;
        litros=0;
        velocidadeMedia=0;
        precioGasoil=0;
    }
    public Consumos (float km, float l, float vMed, float pGas){
        kilometros=km;
        litros=l;
        precioGasoil=pGas;
        velocidadeMedia=vMed;
    }
    //métodos de acceso
    public float getkilometros (){
        return kilometros;
    }
    public void setkilometros(float km){
        kilometros=km;
    }
    public float getlitros(){
        return litros;
    }
    public void setlitros(float l){
        litros=l;
    }
    public float getvelocidadeMedia(){
        return velocidadeMedia;
    }
    public void setvelocidadeMedia(float vMed){
        velocidadeMedia=vMed;   
    } 
    public float getprecioGasoil (){
        return precioGasoil;
    }
    public void setprecioGasoil(float pGas){
        precioGasoil=pGas;
    }
    public float calcularTempo(){
        float tempo=kilometros/velocidadeMedia;
        return tempo;
       
    }
    public float calcular_consumoMedio(float l, float km){
        float consumoMedio=l*100/km;
        return consumoMedio;
    }
    public float calcular_consumoEuros(){
        float consumoEuros=litros*precioGasoil;
        return consumoEuros;
    }
    public float calc_conMedio(){
        return litros*100/kilometros;
    }
    public void visualizar(){
        System.out.println("km = " + kilometros + "litros = " + litros + "velocidade media = " + velocidadeMedia + "precio gasoil = " + precioGasoil);
    }
    
    
    
}
