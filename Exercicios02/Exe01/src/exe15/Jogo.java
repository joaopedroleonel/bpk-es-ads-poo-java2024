package exe15;

public class Jogo {

    private String nome;
    private String genero;
    private double preco;

    public Jogo() {}

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nGenero: " + genero + "\nPreco: " + preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    void pausar() {

        System.out.println("Pausou");

    }

    void iniciar() {
        System.out.println("Iniciou");
    }

}
