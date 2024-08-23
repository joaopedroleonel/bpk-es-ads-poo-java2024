public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    public Cachorro() {}

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nIdade: " + idade + "\nRaça: " + raca);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    void Latir() {

        System.out.println("AUAU");

    }

    void Correr() {
        System.out.println("Correu");
    }

}
