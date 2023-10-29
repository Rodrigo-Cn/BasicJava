package Q6;

public class ContaPoupança {
    private String nome;
    String numeroCartao;
    private double saldo = 0;
    public ContaPoupança(String nome, String numeroCartao){
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("Valor depositado, novo saldo "+this.saldo+"R$"+" rendimento mensal "+saldo*0.01+"R$");
    }
    public void sacar(int valor){
        if (valor<this.saldo){
            this.saldo -= valor;
            System.out.println("Valor sacado, novo saldo "+this.saldo+"R$");
        }else {
            System.out.println("Saldo insuficiente !!!");
        }
    }

}
