public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void Apresentacao() {

        System.out.println("Ola, sou " + nome + " tenho " + idade + " anos e " + altura + " de altura");

    }

}
