public class Filme {

    private String nome;
    private String diretor;
    private double duraco;

    public Filme() {}

    public Filme(String nome, String diretor, double duracao) {
        this.nome = nome;
        this.diretor = diretor;
        this.duraco = duracao;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nDuracao: " + duraco + "\nDiretor: " + diretor);
    }

    public String getNome() {
        return nome;
    }

    public double getDuraco() {
        return duraco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDuraco(double duraco) {
        this.duraco = duraco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    void parar() {

        System.out.println("Parou");

    }

    void iniciar() {
        System.out.println("Iniciou");
    }

}
