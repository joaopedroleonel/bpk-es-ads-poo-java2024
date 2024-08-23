public class Animal {

    private String especie;
    private int idade;
    private double peso;

    public Animal() {}

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return ("\nEspecie: " + especie + "\nIdade: " + idade + "\nPeso: " + peso);
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void alimentar() {
        System.out.println("alimentou");
    }

    void dormir() {
        System.out.println("dormiu");
    }

}
