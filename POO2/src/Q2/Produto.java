package Q2;

public class Produto {
    private String nome;
    private int codigo;
    private String marca;
    private int estoque;
    private double valor;
    public Produto(String nome, int codigo, String marca,int estoque, double valor){
        this.nome = nome;
        this.codigo = codigo;
        this.marca = marca;
        this.estoque = estoque;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade){
        this.estoque += quantidade;
        System.out.println("Adicionador "+quantidade+" no estoque de "+nome+", novo estoque é de: "+this.estoque);
    }
    public void retirardoEstoque(int quantidade){
        if (quantidade<=this.estoque){
            this.estoque -= quantidade;
            System.out.println("Retirados "+quantidade+" do estoque de "+nome+", novo estoque é de: "+this.estoque);
        }
        else {
            System.out.println("Quantidade ultrapassou o estoque.");
        }
    }
    public void saldodoEstoque(){
        System.out.println("Saldo do estoque é "+this.estoque*valor+"R$");

    }
}
