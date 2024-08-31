package exe06;

public class testComputadoe {

    public static void main(String[] args) {
        Computador computador = new Computador("ryzen", 4, 100);
        computador.Ligar();
        computador.Desligar();
        computador.setArmazenamento(-2);
        computador.setMemoriaRam(10);
        System.out.println(computador.getMemoriaRam());
    }

}
