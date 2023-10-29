package Q4;

public class TestarEstudante {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Karlos","12","Direito",9);
        estudante1.verificarAprovacao();
        estudante1.aplicarFaltas(20);
        estudante1.ficharAluno();

        Estudante estudante2 = new Estudante("Léo","180","ADS",6);
        estudante2.verificarAprovacao();
        estudante2.aplicarFaltas(90);
        estudante2.verificarAprovacao();
        estudante2.ficharAluno();
    }
}
