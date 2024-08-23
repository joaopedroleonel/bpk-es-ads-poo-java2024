public class Cozinha {

    private String tipo;
    private String cor;
    private int numeroDePessoas;

    public Cozinha() {}

    public Cozinha(String tipo, String cor, int numeroDePessoas) {
        this.tipo = tipo;
        this.cor = cor;
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public String toString() {
        return ("\nTipo: " + tipo + "\nNumero de Pessoas: " + numeroDePessoas + "\nCor: " + cor);
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void cozinhar() {

        System.out.println("cozinhou");

    }

    void limpar() {

        System.out.println("limpou");

    }

}
