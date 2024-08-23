public class Loja {

    private String nome;
    private String endereco;
    private String telefone;

    public Loja() {}

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nEndereco: " + endereco + "\nTelefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void Fechar() {

        System.out.println("Loja fechada");

    }

    void Abrir() {

        System.out.println("Loja aberta");

    }

}
