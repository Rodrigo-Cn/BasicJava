package Q4;

public class Estudante {
    private String nome;
    private String matricula;
    private String curso;
    private int presença = 200;
    private int materiasConcluidas;

    public Estudante(String nome, String matricula, String curso, int materiasConcluidas){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.materiasConcluidas = materiasConcluidas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setPresença(int presença) {
        this.presença = presença;
    }
    public int getPresença() {
        return presença;
    }

    public int getMateriasConcluidas() {
        return materiasConcluidas;
    }
    public void verificarAprovacao(){
        if (presença >= 150){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
    public void aplicarFaltas(int valor){
        presença -= valor;
        if (this.presença-150>0) {
            System.out.println(this.nome+" levou "+valor+" faltas, ainda pode levar mais "+(this.presença-150)+" sem perder");
        }
    }
    public void ficharAluno(){
        System.out.println("Semestres que faltam para concluir curso: "+(10-this.materiasConcluidas));
    }

}
