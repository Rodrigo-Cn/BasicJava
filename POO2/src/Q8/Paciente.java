package Q8;
public class Paciente {
    private String nome;
    private int id;
    private String problemaClinico;
    public Paciente() {
    }
    public Paciente(String nome, int id, String problemaClinico) {
        this.nome = nome;
        this.id = id;
        this.problemaClinico = problemaClinico;
    }
    public void descricaoPaciente() {
        System.out.println("Descrição Geral: O paciente "+nome+" (id: "+ id + ") tem o problema clínico: "+problemaClinico);
    }
    public void exibirInformacoesPaciente() {
        System.out.println("Nome: "+nome);
        System.out.println("id: "+id);
        System.out.println("Problema Clínico: "+problemaClinico);
    }
    public void atualizarProblemaClinico(String novoProblemaClinico) {
        this.problemaClinico = novoProblemaClinico;
        System.out.println("Problema clínico atualizado para: "+novoProblemaClinico);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProblemaClinico() {
        return problemaClinico;
    }
    public void setProblemaClinico(String problemaClinico) {
        this.problemaClinico = problemaClinico;
    }
}
