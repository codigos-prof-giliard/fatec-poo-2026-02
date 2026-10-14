package a06.lojaonline;

public class EntregaRetiradaLoja extends ModalidadeEntrega {

    public EntregaRetiradaLoja(){
        super("RetiradaLoja");
    }

    @Override
    public double calcularFrete(double subtotal){
        return 0.0;
    }
}