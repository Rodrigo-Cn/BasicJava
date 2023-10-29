package Q7;

public class MetodoMain {
    public static void main(String[] args) {
        /* O método main é o principal, onde o programa deve iniciar o código. Além disso ele recebe as classes, métodos
        * e funções iniciais que serão executados podendo formar uma cadeia de eventos. um exemplo abaixo da chamada de uma função e de uma classe*/
        printar();
        Teste teste = new Teste();
        teste.setNome("Pablo");
        System.out.println(teste.getNome());
    }
    public static void printar(){
        System.out.println("Olá Mundo");
    }
}
