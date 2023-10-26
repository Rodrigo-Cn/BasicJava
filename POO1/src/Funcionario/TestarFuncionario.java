package Funcionario;

public class TestarFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setSalario(2800);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
