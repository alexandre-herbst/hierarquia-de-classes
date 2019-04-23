package poo;

public class SemFio extends Telefone {
    private float frequencia;
    private int canais;
    private float distancia;


    public SemFio(int c, String s, String m, float p, Dimensao d, float frequencia, int canais, float distancia) {
        super(c, s, m, p, d);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }


    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SemFio{" +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distancia=" + distancia +
                '}';
    }


    @Override
    public void imprimirDados() {
        super.imprimirDados();

        System.out.println("Freq: " + this.frequencia);
    }
}
