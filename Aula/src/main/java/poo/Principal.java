package poo;

public class Principal {
    public static void main(String[] args) {
        Dimensao d = new Dimensao(1,2,3);
        Telefone p = new Telefone(5,"a","b", 1, d);
        SemFio sf = new SemFio(1,"a","b", 1, d,  10, 10, 10);
        System.out.println(p);


        Telefone vetor[] = new Telefone[3];

        vetor[0] = new Telefone(5,"a","b", 1, d);
        vetor[1] = new SemFio(1,"a","b", 1, d,  10, 10, 10);
        vetor[2] = new Celular(1,"a","b", 1, d,  10, 10, 10, "linux");

        ((SemFio) vetor[1]).setFrequencia();

        for(int i = 0; i< 3; i++){
            if(vetor[i] instanceof SemFio){
                SemFio c = (SemFio) vetor[i];
                c.imprimirDados();
            }
        }
    }
}
