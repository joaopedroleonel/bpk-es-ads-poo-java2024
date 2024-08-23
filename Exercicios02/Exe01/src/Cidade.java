public class Cidade {

    private String nome;
    private String estado;
    private int populacao;

    public Cidade() {}

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nPopulacao: " + populacao + "\nEstado: " + estado);
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    void diminuirPopulacao() {

        System.out.println(this.populacao -= 1);

    }

    void aumentarPopulacao() {

        System.out.println(this.populacao += 1);

    }

}
