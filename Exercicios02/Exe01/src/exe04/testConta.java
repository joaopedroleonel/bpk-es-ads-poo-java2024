package exe04;

public class testConta {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1, 100.50);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.sacar(12);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.depositar(10);
        System.out.println(contaBancaria.getSaldo());
    }

}
