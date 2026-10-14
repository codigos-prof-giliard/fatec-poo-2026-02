package a06.lojaonline;

public abstract class ModalidadeEntrega {

    private String modalidade;

    public ModalidadeEntrega(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    /*
        O método abstrato você obrigado a sobreescrever ele.
        Ele só fornece contrato.
    */
    public abstract double calcularFrete(double subtotal);
}