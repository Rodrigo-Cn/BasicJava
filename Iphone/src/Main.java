public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.setNome("Iphone 11");
        telefone.setNumero("7799999999");

        Navegador navegador = new Navegador();
        navegador.setUrl("www.google.com");

        ReprodutorMusic music = new ReprodutorMusic();
        music.setNomeMusica("Psy");

        telefone.setNavegador(navegador);
        telefone.setReproduzir(music);

        System.out.println(telefone.getNome());
        System.out.println(telefone.getNumero());
        System.out.println(telefone.navegador.getUrl());
        System.out.println(telefone.reproduzir.getNomeMusica());

    }
}