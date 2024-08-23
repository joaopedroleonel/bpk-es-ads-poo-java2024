public class Time {

    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time() {}

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nNumero de Jogadores: " + numeroDeJogadores + "\nTecnico: " + tecnico);
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setNumeroDeJogadores(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    void diminuirJogadores() {

        System.out.println(this.numeroDeJogadores -= 1);

    }

    void aumentarJogadores() {

        System.out.println(this.numeroDeJogadores += 1);

    }

}
