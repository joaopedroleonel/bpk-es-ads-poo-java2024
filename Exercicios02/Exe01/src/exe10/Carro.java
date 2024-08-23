package exe10;

public class Carro {

    private String tipo;
    private String cor;
    private String placa;

    public Carro() {}

    public Carro(String nome, String cor, String placa) {
        this.tipo = nome;
        this.cor = cor;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return ("\nNome: " + tipo + "\nPlaca: " + placa + "\nCor: " + cor);
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void abastecer() {

        System.out.println("abesteceu");

    }

    void lavar() {
        System.out.println("lavou");
    }

}
