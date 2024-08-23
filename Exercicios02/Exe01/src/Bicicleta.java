public class Bicicleta {

    private String marca;
    private String modelo;
    private int tamanhoDaRoda;

    public Bicicleta() {}

    public Bicicleta(String marca, String modelo, int roda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoDaRoda = roda;
    }

    @Override
    public String toString() {
        return ("\nMarca: " + marca + "\nModelo: " + modelo + "\nTamanho da roda: " + tamanhoDaRoda);
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanhoDaRoda() {
        return tamanhoDaRoda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTamanhoDaRoda(int tamanhoDaRoda) {
        this.tamanhoDaRoda = tamanhoDaRoda;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void pedalar() {

        System.out.println("Pedalou");

    }

    void parar() {
        System.out.println("Parou");
    }

}
