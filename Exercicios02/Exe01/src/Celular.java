public class Celular {

    private String marca;
    private String modelo;
    private int capacidadeDaBateria;

    public Celular() {}

    public Celular(String marca, String modelo, int bateira) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDaBateria = bateira;
    }

    @Override
    public String toString() {
        return ("\nMarca: " + marca + "\nModelo: " + modelo + "\ncapacidade da Bateria: " + capacidadeDaBateria);
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadeDaBateria() {
        return capacidadeDaBateria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeDaBateria(int capacidadeDaBateria) {
        this.capacidadeDaBateria = capacidadeDaBateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void Ligar() {

        System.out.println("Ligado");

    }

    void Desligar() {
        System.out.println("Desligado");
    }

}
