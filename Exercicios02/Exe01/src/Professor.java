public class Professor {

    private String nome;
    private String disciplina;
    private double salario;

    public Professor() {}

    public Professor(String nome, String disciplina, int matricula) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = matricula;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nDisciplina: " + disciplina + "\nSalario: " + salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    void darAula() {
        System.out.println("Deu aula");
    }

    void corrigirProvas() {
        System.out.println("corrigiu as provas");
    }

}
