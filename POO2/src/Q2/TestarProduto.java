package Q2;

public class TestarProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz",2,"Ride",0,2.50);
        produto1.adicionarEstoque(100);
        produto1.saldodoEstoque();
        produto1.retirardoEstoque(80);
        produto1.saldodoEstoque();


        Produto produto2 = new Produto("Açúcar",1,"RGB",0,6.50);
        produto2.adicionarEstoque(90);
        produto2.saldodoEstoque();
        produto2.retirardoEstoque(100);
        produto2.saldodoEstoque();
    }
}
