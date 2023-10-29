package Q5;

public class TestarContac {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Tulibio Fernandes","738581341384");
        System.out.println("Entrando na conta de: "+conta1.getNome());
        conta1.sacar(100);
        conta1.depositar(10000);
        conta1.sacar(4000);

        ContaCorrente conta2 = new ContaCorrente("Lúcio Alves","905813433434");
        System.out.println("Entrando na conta de: "+conta2.getNome());
        conta2.depositar(1000);
        conta2.sacar(40);
    }
}
