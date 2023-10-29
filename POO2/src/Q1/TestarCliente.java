package Q1;

public class TestarCliente {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Rodrigo","11111111150","rodrigo@gmail.com",100,0);
        cliente1.adicionarSaldo(3000);
        cliente1.sacarSaldo(30);
        cliente1.realizarCompra(2000);
        cliente1.sacarSaldo(200);

        Cliente cliente2 = new Cliente("Fernando","11644451150","fernado@gmail.com",0,0);
        cliente2.adicionarSaldo(3000);
        cliente2.sacarSaldo(445);
        cliente2.realizarCompra(4000);
        cliente2.realizarCompra(1000);
        cliente2.sacarSaldo(100);

    }
}
