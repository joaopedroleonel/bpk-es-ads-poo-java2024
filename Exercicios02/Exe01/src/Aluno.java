public class Aluno {

    private String nome;
    private String curso;
    private int matricula;

    public Aluno() {}

    public Aluno(String nome, String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return ("\nNome: " + nome + "\nCurso: " + curso + "\nMatricula: " + matricula);
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    void calcularNotas() {

        int n1 = 7;
        int n2 = 9;
        int n3 = 6;
        int n4 = 9;
        System.out.println((n1 + n2 + n3 + n4) / 4);

    }

}
