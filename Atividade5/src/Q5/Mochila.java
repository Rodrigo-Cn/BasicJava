package Q5;

public class Mochila {
    private String material;
    private double pesoSuportado;
    private String tipo;
    public Mochila(){}
    public Mochila(String material, double pesoSuportado, String tipo){
        this.material = material;
        this.pesoSuportado = pesoSuportado;
        this.tipo = tipo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPesoSuportado(double pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }

    public double getPesoSuportado() {
        return pesoSuportado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void ficharMochila(){
        System.out.println("Material: "+material);
        System.out.println("Peso Suportado: "+pesoSuportado);
        System.out.println("Tipo: "+tipo);
    }
    public void abrir(){
        System.out.println("Mochila Aberta !!!");
    }
    public void fechar(){
        System.out.println("Mochila Fechada !!!");
    }
}
