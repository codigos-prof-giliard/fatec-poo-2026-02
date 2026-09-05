
public class Funcionario {
    
    public static int contador = 0; // compartilhado entre os objetos;

    // Atributos da minha classe
    private String nome;
    private String sobrenome;
    private String cpf;
    private String nomeCargo;
    private String departamento;
    private double salarioBase;
    private int id;

    /* Função do construtor
        Restringir como os objetos são criados
    */

    // modificador-visibilidade NomeDaClasse( parametros )
    // public Funcionario(){};
    // construtor padrão

    public Funcionario(String nome, String cpf){
        this.setNome(nome);
        this.cpf = cpf;
        // Lógica de inicialização
        this.salarioBase = 1500.0;
        this.departamento = "empresa";
        Funcionario.contador += 1;
        this.id = Funcionario.contador;
    }

    public Funcionario(String nome, String cpf, String nomeCargo, String departamento, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.nomeCargo = nomeCargo;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        Funcionario.contador += 1;
    }

    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        Funcionario.contador += 1;
    }

    public void setNome(String nome){
        this.nome = nome;
        int index = nome.lastIndexOf(" ");
        if (index > 0){
            this.sobrenome = nome.substring(index+1);
        } else {
            this.sobrenome = nome;
        }
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNomeCargo(String nomeCargo){
        this.nomeCargo = nomeCargo;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setSalarioBase(double salarioBase){
        if (salarioBase >= 1500.00) {
            this.salarioBase = salarioBase;
        } else if (this.salarioBase < 1500.00) {
            this.salarioBase = 1500.00;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public String getNomeCargo(){
        return this.nomeCargo;
    }

    public int getId(){
        return this.id;
    }

    public double calculaGanhoAnual(){
        double ganhos = this.salarioBase * 12;
        return ganhos;
    }

    public double calculaINSS(){
        return this.salarioBase * 0.08;
    }

    public double calculaFerias(){
        return this.salarioBase * 1.33;
        // this.salarioBase + (this.salarioBase * 0.3)
        // equivalente
        // this.salarioBase * 1.3
    }

    public double calculaIR(){
        double descontoINSS = calculaINSS();
        double salarioLiquido = this.salarioBase - descontoINSS;

        if (salarioLiquido < 5000.0){
            return 0.0;
        } else if (5000.0 <= salarioLiquido && salarioLiquido < 7000.00){
            return salarioLiquido * 0.10;
        } // else  
        return salarioLiquido * 0.25;
    }

    public void bonificacao(double bonificacao){
        double metadeSalario = this.salarioBase * 0.5;
        if (0 < bonificacao && bonificacao < metadeSalario){
            this.salarioBase += bonificacao;
        }
    }

    public void alteraDepartamento(String departamento){
        this.setDepartamento(departamento);
    }

    public String toString(){
        return "Funcionario< " + this.sobrenome + ", "+ this.id + " >";    }

}
