package exe01;

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
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
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

        if(numeroDePaginas > 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            System.out.println("numero é negativo");
        }

    }

    public void abrirLivro() {

        System.out.println("exe01.Livro aberto!");

    }

    public void lerPagina(int pagina) {

        if(pagina <= numeroDePaginas) {
            System.out.println(pagina);
        } else {
            System.out.println("Pagina não existe");
        }

    }

}
