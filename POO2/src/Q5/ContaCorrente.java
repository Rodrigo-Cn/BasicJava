package Q5;

public class ContaCorrente {
    private String nome;
    private String numeroCartao;
    private double saldo = 0;
    public ContaCorrente(String nome, String numeroCartao){
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }
    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("Valor depositado, novo saldo "+this.saldo+"R$");
    }
    public void sacar(int valor){
        if (valor<this.saldo){
            this.saldo -= valor;
            System.out.println("Valor sacado, novo saldo "+this.saldo+"R$");
        }else {
            System.out.println("Saldo insuficiente !!!");
        }
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
}
