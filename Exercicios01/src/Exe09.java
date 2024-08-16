import java.util.Scanner;

public class Exe09 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero:");
        int n1 = scanner.nextInt();

        System.out.print("Segundo numero:");
        int n2 = scanner.nextInt();

        System.out.print("Selecione uma das opções abaixo \n [+] \n [-] \n [*] \n [/] \n");
        String opcao = scanner.next();

        switch (opcao) {
            case "+":
                System.out.print(n1 + n2);
                break;
            case "-":
                System.out.print(n1 - n2);
                break;
            case "*":
                System.out.print(n1 * n2);
                break;
            case "/":
                System.out.print(n1 / n2);
                break;
            default:
                break;
        }

    }

}
