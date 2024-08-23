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
        this.armazenamento = armazenamento;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    void Ligar() {

        System.out.println("Ligado");

    }

    void Desligar() {
        System.out.println("Desligado");
    }

}
