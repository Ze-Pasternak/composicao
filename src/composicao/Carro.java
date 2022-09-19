package composicao;

public class Carro {

    private Motor motor;
    private Direcao direcao;

    public Carro() {
        motor = new Motor();

    }
    public void ligarCarro(int potencia){
       motor = new Motor (potencia);   
    }

    public Carro(int potencia) {
        motor = new Motor(potencia);
    }
    public void ImprimeDados(){
        System.out.println("Potencia do Motor: "+""+motor.getPotencia());
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

}
