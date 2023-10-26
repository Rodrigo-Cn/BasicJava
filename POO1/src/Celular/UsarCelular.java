package Celular;

public class UsarCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.cor = "Vermelho";
        celular1.peso = 1.4f;
        celular1.largura = 5;
        celular1.altura = 10;

        celular1.ligar();
        celular1.telefonar();
    }
}
