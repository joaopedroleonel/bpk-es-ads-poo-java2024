import java.util.Scanner;

public class Exe11 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        String palavraAoContario = "";

        System.out.print("Escreva a palavra:");
        String palavra = scanner.next();

        for (int i = palavra.length() - 1; i >= 0; i--) {

            palavraAoContario += palavra.charAt(i);

        }

        if(palavra.equals(palavraAoContario)) {
            System.out.print("A palavra é Palíndromo");
        } else {
            System.out.print("A palavra não é Palíndromo");
        }

    }

}
