import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sentinela = 0;

        while(sentinela == 0) {

            System.out.println("Digite o numero do exercicio ou 0 para sair \n");
            int digitado = scanner.nextInt();

            switch (digitado) {
                case 0:
                    sentinela++;
                    break;
                case 1:
                    Livro livro = new Livro("titulo", "autor", 20);
                    livro.abrirLivro();
                    livro.lerPagina(2);
                    break;
                case 2:
                    Celular celular = new Celular("Samsuga", "A20", 20);
                    celular.Ligar();
                    celular.Desligar();
                    break;
                case 3:
                    Pessoa pessoa = new Pessoa("João", 17, 1.8);
                    pessoa.Apresentacao();
                    break;
                case 4:
                    ContaBancaria contaBancaria = new ContaBancaria(1, 100.50);
                    System.out.println(contaBancaria.getSaldo());
                    contaBancaria.sacar(12);
                    System.out.println(contaBancaria.getSaldo());
                    contaBancaria.depositar(10);
                    System.out.println(contaBancaria.getSaldo());
                    break;
                case 5:
                    Cachorro cachorro = new Cachorro("toto", "buldog", 2);
                    cachorro.Correr();
                    cachorro.Latir();
                    break;
                case 6:
                    Computador computador = new Computador("ryzen", 4, 100);
                    computador.Ligar();
                    computador.Desligar();
                    break;
                case 7:
                    Aluno aluno = new Aluno("João", "Eng", 1);
                    aluno.calcularNotas();
                    break;
                case 8:
                    Professor professor = new Professor("Jhony", "orientacao", 8000);
                    professor.darAula();
                    professor.corrigirProvas();
                    break;
                case 9:
                    Produto produto = new Produto("Maçã", 2, 2.50);
                    System.out.println(produto.getQuantidadeEstoque());
                    produto.aumentarEstoque();
                    System.out.println(produto.getQuantidadeEstoque());
                    produto.diminuirEstoque();
                    System.out.println(produto.getQuantidadeEstoque());
                    break;
                case 10:
                    Carro carro = new Carro("tipo", "azul", "placa");
                    carro.abastecer();
                    carro.lavar();
                    break;
                case 11:
                    Cidade cidade = new Cidade("Toledo", "Parana", 12000);
                    cidade.diminuirPopulacao();
                    cidade.aumentarPopulacao();
                    break;
                case 12:
                    Filme filme = new Filme("Filme", "diretor", 2.50);
                    filme.iniciar();
                    filme.parar();
                    break;
                case 13:
                    System.out.println("Não tem na lista");
                    break;
                case 14:
                    Time time = new Time("Inter", "nao sei", 12);
                    time.aumentarJogadores();
                    time.diminuirJogadores();
                    break;
                case 15:
                    Jogo jogo = new Jogo("red dead", "ação", 120.50);
                    jogo.iniciar();
                    jogo.pausar();
                    break;
                case 16:
                    Loja loja = new Loja("Loja", "Rua tal, 12", "(45) 1111-1111");
                    loja.Abrir();
                    loja.Fechar();
                    break;
                case 17:
                    Animal animal = new Animal("coala", 2, 2.50);
                    animal.alimentar();
                    animal.dormir();
                    break;
                case 18:
                    System.out.println("Não tem na lista");
                    break;
                case 19:
                    LivroDigital livroDigital = new LivroDigital("titulo", "autor", 20);
                    livroDigital.abrirLivro();
                    livroDigital.fecharLivro();
                    break;
                case 20:
                    Bicicleta bicicleta = new Bicicleta("Modelo", "marca", 20);
                    bicicleta.pedalar();
                    bicicleta.parar();
                    break;
                case 21:
                    Cozinha cozinha = new Cozinha("tipo", "branca", 12);
                    cozinha.cozinhar();
                    cozinha.limpar();
                    break;
                case 22:
                    Empresa empresa = new Empresa("nome", "sla", 12);
                    empresa.demitir();
                    empresa.contratar();
                    break;
                default:
                    System.out.println("Valor invalido!");
                    break;

            }

        }

    }
}