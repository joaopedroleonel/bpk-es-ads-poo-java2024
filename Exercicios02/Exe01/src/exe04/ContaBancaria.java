package exe04;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria() {}

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ("Conta: " + numeroConta + " Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double deposito) {

        this.saldo += deposito;

    }

    void sacar(double valor) {

        this.saldo -= valor;

    }

}
