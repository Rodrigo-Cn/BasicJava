package Q3;

public class testarFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Arboleda","11122233390",800.0,"Gerente");

        funcionario1.marcarPontoDiario();
        funcionario1.marcarPontoDiario();
        funcionario1.marcarPontoDiario();
        funcionario1.marcarPontoDiario();
        funcionario1.marcarPontoDiario();
        funcionario1.verSalarioMensal();
        funcionario1.finalizarMes();
        funcionario1.verSalarioMensal();

        Funcionario funcionario2 = new Funcionario("Lucas","11122888890",900.0,"Analista de Sistemas");

        funcionario2.marcarPontoDiario();
        funcionario2.marcarPontoDiario();
        funcionario2.marcarPontoDiario();
        funcionario2.marcarPontoDiario();
        funcionario2.marcarPontoDiario();
        funcionario2.verSalarioMensal();
        funcionario2.finalizarMes();
        funcionario2.verSalarioMensal();

    }
}
