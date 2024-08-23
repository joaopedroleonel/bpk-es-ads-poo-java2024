public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private double preco;

    public Produto() {}

    public Produto(String nome, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nQuantiade em estoque: " + quantidadeEstoque + "\nPreco: " + preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void aumentarEstoque() {

        System.out.println(this.quantidadeEstoque += 1);

    }

    void diminuirEstoque() {

        System.out.println(this.quantidadeEstoque -= 1);

    }

}
