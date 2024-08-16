import java.util.Scanner;

public class Exe13 {

    public void executar() {

        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int)(Math.random() * 100);
        int digitado;
        int contador = 0;

        do {

            contador++;

            System.out.print("Advinhe o numero:");
            digitado = scanner.nextInt();

            if(digitado == numeroAleatorio) {
                System.out.print("Acertou! \n");
            } else if(digitado > numeroAleatorio) {
                System.out.print("O numero é menor \n");
            } else {
                System.out.print("O numero é maior \n");
            }

        } while (digitado != numeroAleatorio);

        System.out.print("Numero de tentativas: " + contador);

    }

}
