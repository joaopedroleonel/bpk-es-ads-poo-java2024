import java.util.Scanner;

public class Exe08 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome:");
        String nome = scanner.next();

        System.out.print("Idade:");
        int idade = scanner.nextInt();

        System.out.print(nome + "\n" + idade + "\n");

    }

}
