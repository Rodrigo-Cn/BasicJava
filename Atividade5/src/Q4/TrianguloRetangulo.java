package Q4;

public class TrianguloRetangulo {
    private double valorDeA;
    private double valorDeB;
    private double valorDeC;
    public TrianguloRetangulo(){

    }
    public TrianguloRetangulo(double valorDeA, double valorDeB, double valorDeC){
        if (valorDeA==0){
            this.valorDeA = 1;
        }
        else{
            this.valorDeA = valorDeA;
        }
        this.valorDeB = valorDeB;
        this.valorDeC = valorDeC;
    }
    public void setValorDeA(double valorDeA) {
        if (valorDeA==0){
            this.valorDeA = 1;
        }
        else{
            this.valorDeA = valorDeA;
        }
    }

    public double getValorDeA() {
        return valorDeA;
    }

    public void setValorDeB(double valorDeB) {
        this.valorDeB = valorDeB;
    }

    public double getValorDeB() {
        return valorDeB;
    }

    public void setValorDeC(double valorDeC) {
        this.valorDeC = valorDeC;
    }

    public double getValorDeC() {
        return valorDeC;
    }
    public double retornarValorDeDelta(){
        return ((valorDeB*valorDeB)-4*valorDeA*valorDeC);
    }
    public void retornarValorDeX(){
        double delta = retornarValorDeDelta();
        System.out.println("Valor de delta: "+delta);
        System.out.println("O valor de X1 é: "+((-valorDeB+Math.sqrt(delta))/(2*valorDeA)));
        System.out.println("O valor de X2 é: "+((-valorDeB-Math.sqrt(delta))/(2*valorDeA)));
    }
}
