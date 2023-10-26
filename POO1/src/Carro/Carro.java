package Carro;

public class Carro {
    private String modelo;
    private int velocidadeMax;
    private int velocidadeAtual;
    public Carro(){
        this.modelo = "Qualquer";
        this.velocidadeMax = 120;
        this.velocidadeAtual = 0;
    }
    public Carro(String modelo, int velocidadeMax){
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = 0;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void ligarCarro(){
        System.out.println("O carro ligou");
    }
    public void desligarCarro(){
        System.out.println("O carro desligou");
    }
    public void acelerar(int velocidade){
        if(this.velocidadeAtual+velocidade<=this.velocidadeMax){
            this.velocidadeAtual += velocidade;
            System.out.println("Acelerando ! Velocidade atual: "+this.velocidadeAtual+"km/h");
        }else {
            System.out.println("Não pode ultrapassar a velocidade máxima !!!");
        }
    }
    public void desacelerar(int velocidade){
        if (this.velocidadeAtual==0){
            System.out.println("O carro está parado");
        } else if (this.velocidadeAtual-velocidade<0) {
            System.out.println("Não é possível diminuir abaixo de "+this.velocidadeAtual+" km/h");
        } else{
            this.velocidadeAtual -= velocidade;
            System.out.println("Desacelerando ! Velocidade atual: "+this.velocidadeAtual+"km/h");
            if (this.velocidadeAtual == 0){
                pararCarro();
            }
        }
    }

    public void pararCarro(){
        this.velocidadeAtual = 0;
        System.out.println("O carro parou.");
    }
}
