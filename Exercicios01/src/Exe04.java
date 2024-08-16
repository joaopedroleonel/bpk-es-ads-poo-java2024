import java.util.Scanner;

public class Exe04 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero:");
        int n = scanner.nextInt();

        if((n % 2) == 0) {
            System.out.print("Par");
        } else {
            System.out.print("Impar");
        }

    }

}
