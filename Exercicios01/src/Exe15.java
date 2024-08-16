import java.util.Scanner;

public class Exe15 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero:");
        int n = scanner.nextInt();

        int fatorial1 = n;

        for (int i = n - 1; i > 0; i--) {

            fatorial1 *= i;

        }

        System.out.print(fatorial1 + "\n");

        System.out.print(recursividade(n) + "\n");

    }

    public int recursividade(int n) {

        if(n == 0) {
            return 1;
        } else {
            return (n * recursividade(n - 1));
        }

    }

}
