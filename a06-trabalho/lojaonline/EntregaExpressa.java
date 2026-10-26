package a06.lojaonline;

public class EntregaExpressa extends ModalidadeEntrega {
    public EntregaExpressa () {

    }

    @Override
    public double calcularFrete(double subtotal){
        return 20.0;
    }
}


/*
    giliard.godoi@fatecourinhos.edu.br
*/