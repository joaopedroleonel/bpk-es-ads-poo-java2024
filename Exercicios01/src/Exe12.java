import java.util.Scanner;

public class Exe12 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        int n[] = new int[5];

        for (int i = 0; i < n.length; i++) {

            System.out.print("Digite um numero:");
            n[i] = scanner.nextInt();

        }

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n.length; i++) {

            System.out.print(n[i] + "\n");

        }

    }

}
