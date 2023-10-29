package Q3;

public class Funcionario {
    private String nome;
    private String cpf;
    private int pontosBatidos;
    private double diaria;
    private String cargo;

    public Funcionario(String nome, String cpf, double diaria, String cargo){
        this.nome = nome;
        this.cpf = cpf;
        this.diaria = diaria;
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public double getDiaria() {
        return diaria;
    }
    public void finalizarMes(){
        System.out.println("Mês finalizado !!!, diárias zeradas");
        pontosBatidos = 0;
    }
    public void verSalarioMensal(){
        System.out.println("O salário de "+nome+" no cargo de "+cargo+" até o momento é "+diaria*pontosBatidos+"R$");
    }
    public void marcarPontoDiario(){
        pontosBatidos += 1;
        System.out.println(nome+" mais um dia de trabalho, total até agora: "+pontosBatidos);
    }

}
