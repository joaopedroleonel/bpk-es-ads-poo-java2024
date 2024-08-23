package exe22;

public class Empresa {

    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa() {}

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nNumero de Funcionarios: " + numeroFuncionarios + "\nCpnj: " + cnpj);
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    void demitir() {

        System.out.println(this.numeroFuncionarios -= 1);

    }

    void contratar() {

        System.out.println(this.numeroFuncionarios += 1);

    }

}
