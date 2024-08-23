public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro() {}

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return ("\nTitulo: " + titulo + "\nAutor: " + autor + "\nNumero de Paginas: " + numeroDePaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
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

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    void abrirLivro() {

        System.out.println("Livro aberto!");

    }

    void lerPagina(int pagina) {

        if(pagina <= numeroDePaginas) {
            System.out.println(pagina);
        } else {
            System.out.println("Pagina não existe");
        }

    }

}
