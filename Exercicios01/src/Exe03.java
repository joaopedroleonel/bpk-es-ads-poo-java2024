import java.util.Scanner;

public class Exe03 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero:");
        int n1 = scanner.nextInt();

        System.out.print("Segundo numero:");
        int n2 = scanner.nextInt();

        System.out.print("Adição: " + (n1 + n2) + "\n");
        System.out.print("Subtração: " + (n1 - n2) + "\n");
        System.out.print("Mutiplicação: " + (n1 * n2) + "\n");
        System.out.print("Divisão: " + (n1 / n2) + "\n");

    }

}
