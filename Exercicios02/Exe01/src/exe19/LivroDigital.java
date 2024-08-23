package exe19;

public class LivroDigital {

    private String titulo;
    private String autor;
    private int tamanhoDoArquivo;

    public LivroDigital() {}

    public LivroDigital(String titulo, String autor, int tamanhoDoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    public String toString() {
        return ("\nTitulo: " + titulo + "\nAutor: " + autor + "\nTamanho do Arquivo: " + tamanhoDoArquivo);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTamanhoDoArquivo(int tamanhoDoArquivo) {
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    void abrirLivro() {

        System.out.println("exe01.Livro aberto!");

    }

    void fecharLivro() {

        System.out.println("exe01.Livro fechado!");

    }

}
