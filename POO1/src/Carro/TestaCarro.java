package Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Jetta",210);
        System.out.println("======= andando em um(a) "+carro1.getModelo()+" =======");
        carro1.ligarCarro();
        carro1.acelerar(20);
        carro1.acelerar(30);
        carro1.acelerar(35);
        carro1.acelerar(30);
        carro1.acelerar(30);
        carro1.acelerar(30);
        carro1.desacelerar(5);
        carro1.desacelerar(40);
        carro1.desacelerar(100);
        carro1.desacelerar(30);
        carro1.desligarCarro();

        System.out.println("\n\n\n");
        Carro carro2 = new Carro("Ferrari",300);
        System.out.println("======= andando em um(a) "+carro2.getModelo()+" =======");
        carro2.ligarCarro();
        carro2.acelerar(20);
        carro2.acelerar(30);
        carro2.acelerar(35);
        carro2.acelerar(30);
        carro2.acelerar(30);
        carro2.acelerar(130);
        carro2.desacelerar(5);
        carro2.desacelerar(40);
        carro2.desacelerar(100);
        carro2.desacelerar(130);
        carro2.desligarCarro();
    }
}
