package composicao;



public class Composicao {

    public static void main(String[] args) {
        //PRIMEIRA FORMA DE CHAMAR OS CONTRUTORES

        /* 
        
        Carro carro = new Carro();
        Carro carro2= new Carro(2000);
        
       
         /*
        
        segunda forma de chamar o metodo
        /*
        Carro carro3 = new Carro();
        carro3.ligarCarro(2000);
        */
                Carro carro4 = new Carro(0);
                Motor motor = new Motor();
                Motor motor2 = new Motor(2000);
                
                carro4.setMotor(motor);
                
                carro4.ImprimeDados();
                
                
    }
   

}
