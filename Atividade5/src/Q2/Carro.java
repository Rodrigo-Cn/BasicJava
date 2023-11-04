package Q2;

public class Carro {
    private String marca;
    private String nome;
    private int quantPortas;
    private String cor;
    private double valor;
    private double potencia;
    public double parcelas;
    public Carro(String marca, String nome, int quantPortas, String cor, double valor, double potencia){
        this.marca = marca;
        this.nome = nome;
        this.quantPortas = quantPortas;
        this.cor = cor;
        this.valor = valor;
        this.potencia = potencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }
    public void definirValor(){
        System.out.println("Se o pagamento for em "+parcelas+" parcelas, o valor passará de "+valor+"R$, para "+(valor+valor*(parcelas/100))+"R$");
    }
}

