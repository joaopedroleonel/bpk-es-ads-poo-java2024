package exe01;public class test {

    public static void main(String[] args) {

        Livro livro = new Livro("titulo", "autor", 20);
        livro.abrirLivro();
        livro.lerPagina(2);

    }

}
