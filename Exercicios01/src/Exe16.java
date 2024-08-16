import java.util.Scanner;

public class Exe16 {

    Scanner scanner = new Scanner(System.in);

    public void executar() {

        System.out.print("[1] Celsius para Fahrenheit" + "\n");
        System.out.print("[2] Fahrenheit para Celsius" + "\n");
        int digitado = scanner.nextInt();

        switch (digitado) {
            case 1:
                CelsiusparaFahrenheit();
                break;
            case 2:
                FahrenheitparaCelsius();
                break;
        }

    }

    public void CelsiusparaFahrenheit() {

        System.out.print("Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.print("Fahrenheit: " + fahrenheit);
    }

    public void FahrenheitparaCelsius() {

        System.out.print("Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ( (fahrenheit - 32) * 5 ) / 9;
        System.out.print("Celsius: " + celsius);

    }

}
