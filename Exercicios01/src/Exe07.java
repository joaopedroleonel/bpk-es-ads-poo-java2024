import java.util.Scanner;

public class Exe07 {

    public int executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero:");
        int n1 = scanner.nextInt();

        System.out.print("Segundo numero:");
        int n2 = scanner.nextInt();

        return (n1 + n2);

    }

}
