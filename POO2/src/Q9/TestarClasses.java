package Q9;

public class TestarClasses {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("João", "Natação", 1, 7.5);
        atleta1.exibirInformacoes();
        atleta1.aprovacao();


        Atleta atleta2 = new Atleta("Maria", "Corrida", 2, 5.8);
        atleta2.exibirInformacoes();
        atleta2.aprovacao();

        Casa casa1 = new Casa(1, 4, 20);
        System.out.println("Informações da Casa 1:");
        casa1.exibirInformacoesCasa();
        casa1.calcularIPTU();


        Casa casa2 = new Casa(2, 3, 15);
        System.out.println("Informações da Casa 2:");
        casa2.exibirInformacoesCasa();
        casa2.calcularIPTU();
    }
}
