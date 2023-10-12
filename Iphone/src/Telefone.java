public class Telefone{
    private String nome;
    private String numero;
    ReprodutorMusic reproduzir;
    Navegador navegador;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setReproduzir(ReprodutorMusic reproduzir) {
        this.reproduzir = reproduzir;
    }

    public ReprodutorMusic getReproduzir() {
        return reproduzir;
    }

    public void setNavegador(Navegador navegador) {
        this.navegador = navegador;
    }

    public Navegador getNavegador() {
        return navegador;
    }
}
