package exe15;

public class testJogo {

    public static void main(String[] args) {
        Jogo jogo = new Jogo("red dead", "ação", 120.50);
        jogo.iniciar();
        jogo.pausar();
    }

}
