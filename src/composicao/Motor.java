
package composicao;


public class Motor {
 private int potencia;
 
 
 public Motor(){
 potencia = 1000;//VALOR PADRÂO
 
 }
public Motor(int potencia){
    this.potencia=potencia;//VALOR DEFINIDO POR VOCES

}
 
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
 
    }
    