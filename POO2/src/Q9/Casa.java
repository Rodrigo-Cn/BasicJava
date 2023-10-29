package Q9;

public class Casa {
    private int numero;
    private int nMoradores;
    private int tamanhoDaFrente;
    private double valorIptu;
    public Casa(int numero, int nMoradores, int tamanhoDaFrente) {
        this.numero = numero;
        this.nMoradores = nMoradores;
        this.tamanhoDaFrente = tamanhoDaFrente;
        this.valorIptu = valorIptu;
    }
    public void calcularIPTU() {
        System.out.println("Valor do Iptu:"+tamanhoDaFrente*0.001);
        valorIptu = (tamanhoDaFrente*0.001);
    }
    public void exibirInformacoesCasa() {
        System.out.println("Número: "+numero);
        System.out.println("Número de Moradores: "+nMoradores);
        System.out.println("Tamanho da Frente: "+tamanhoDaFrente);
        System.out.println("Valor do IPTU: "+valorIptu);
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getnMoradores() {
        return nMoradores;
    }

    public void setnMoradores(int nMoradores) {
        this.nMoradores = nMoradores;
    }

    public int getTamanhoDaFrente() {
        return tamanhoDaFrente;
    }

    public void setTamanhoDaFrente(int tamanhoDaFrente) {
        this.tamanhoDaFrente = tamanhoDaFrente;
    }

    public double getValorIptu() {
        return valorIptu;
    }
}
