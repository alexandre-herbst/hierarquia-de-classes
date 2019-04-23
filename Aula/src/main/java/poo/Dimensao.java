package poo;

public class Dimensao {
    private int altura;
    private int largura;
    private int profundide;
    public Dimensao(int a, int l, int p){
        this.altura = a;
        this.largura = l;
        this.profundide = p;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", profundide=" + profundide +
                '}';
    }
}
