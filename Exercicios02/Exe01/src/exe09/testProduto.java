package exe09;

public class testProduto {

    public static void main(String[] args) {
        Produto produto = new Produto("Maçã", 2, 2.50);
        System.out.println(produto.getQuantidadeEstoque());
        produto.aumentarEstoque();
        System.out.println(produto.getQuantidadeEstoque());
        produto.diminuirEstoque();
        System.out.println(produto.getQuantidadeEstoque());
    }

}
