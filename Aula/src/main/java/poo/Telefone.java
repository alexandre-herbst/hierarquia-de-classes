package poo;

public class Telefone {
    private int codigo;
    private String numSerie, modelo;
    private float peso;
    private Dimensao dim;

    public Telefone(int c, String s, String m, float p, Dimensao d) {

        this.codigo = c;
        this.peso = p;
        this.dim = d;
        this.numSerie = s;
        this.modelo = m;


    }



    public void imprimirDados(){
        System.out.println("Codigo: " + this.codigo);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dim=" + dim +
                '}';
    }


    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
}
