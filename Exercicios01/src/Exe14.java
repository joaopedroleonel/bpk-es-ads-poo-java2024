import java.util.Scanner;

public class Exe14 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a palavra:");
        String palavra = scanner.next();

        int numeroVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {

            switch (palavra.toUpperCase().charAt(i)) {
                case 'A':
                    numeroVogais++;
                    break;
                case 'E':
                    numeroVogais++;
                    break;
                case 'I':
                    numeroVogais++;
                    break;
                case 'O':
                    numeroVogais++;
                    break;
                case 'U':
                    numeroVogais++;
                    break;
            }

        }

        System.out.print("Numero de Vogais: " + numeroVogais);

    }

}
