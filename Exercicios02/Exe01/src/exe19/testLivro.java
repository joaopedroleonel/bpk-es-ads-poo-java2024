package exe19;

public class testLivro {

    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("titulo", "autor", 20);
        livroDigital.abrirLivro();
        livroDigital.fecharLivro();
    }

}
