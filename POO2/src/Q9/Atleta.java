package Q9;

public class Atleta {
    private String nome;
    private String modalidade;
    private int id;
    private double nota;
    public void exibirInformacoes() {
        System.out.println("Nome: "+nome);
        System.out.println("Modalidade: "+modalidade);
        System.out.println("ID: "+id);
        System.out.println("Nota: "+nota);
    }
    public boolean notaAprovada() {
        return nota>=6.0;
    }
    public void aprovacao(){
        if (notaAprovada()){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
    public Atleta(String nome, String modalidade, int id, double nota) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.id = id;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
