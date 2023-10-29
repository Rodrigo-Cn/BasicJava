package Q8;

public class Medico {
    private String nome;
    private String especializacao;
    private int id;
    public Medico(){
    }
    public Medico(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }
    public void exibirInformacoesMedico() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialização: " + especializacao);
    }
    public void atualizarEspecializacao(String novaEspecializacao) {
        this.especializacao = novaEspecializacao;
        System.out.println("Especialização atualizada para: " + novaEspecializacao);
    }
    public void mensagemBoasVindas() {
        System.out.println("Olá, tubo bem? Eu sou o Dr. "+nome+" e sou especialista em "+especializacao+".");
        System.out.println("Bem-vindo ao meu consultório!");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecializacao() {
        return especializacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
