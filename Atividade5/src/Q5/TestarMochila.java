package Q5;

public class TestarMochila {
    public static void main(String[] args) {

        Mochila[] mochila = new Mochila[3];

        mochila[0] = new Mochila("Algodão",10.91,"Mochila de Notebook");
        mochila[1] = new Mochila("Poliéster",15.13,"Mochila de Viagem");
        mochila[2] = new Mochila("Neoprene",8.30,"Mochila de Negócios");

        double maior = mochila[0].getPesoSuportado();
        int indice = 0;
        for (int i=1; i<3; i++){
            if(maior<mochila[i].getPesoSuportado()){
                maior = mochila[i].getPesoSuportado();
                indice = i;
            }
        }

        System.out.println("A mochila maior é:");
        mochila[indice].ficharMochila();
    }
}
