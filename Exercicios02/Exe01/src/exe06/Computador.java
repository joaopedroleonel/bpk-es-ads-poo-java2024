package exe06;

public class Computador {

    private String processador;
    private int memoriaRam;
    private int armazenamento;

    public Computador() {}

    public Computador(String processador, int memoriaRam, int armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return ("\nProcessador: " + processador + "\nMemoria ram: " + memoriaRam + "\nArmazenamento: " + armazenamento);
    }

    public String getProcessador() {
        return processador;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setArmazenamento(int armazenamento) {
        if(armazenamento > 10) {

            this.armazenamento = armazenamento;

        } else {
            System.out.println("Armazenamento não pode ser negativo");
        }
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRam(int memoriaRam) {

        if(memoriaRam > 0) {
            this.memoriaRam = memoriaRam;
        } else {
            System.out.println("Memoria ram não pode ser negativo");
        }

    }

    void Ligar() {

        System.out.println("Ligado");

    }

    void Desligar() {
        System.out.println("Desligado");
    }

}
