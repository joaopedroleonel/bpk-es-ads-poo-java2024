import java.util.Scanner;

public class Exe10 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero:");
        int n = scanner.nextInt();

        boolean primo = false;

        for (int i = 2; i < n; i++) {
            if((n % i) == 0) {
                primo = true;
            }
        }

        if(primo) {
            System.out.print("Não é Primo");
        } else {
            System.out.print("Primo");
        }

    }

}
