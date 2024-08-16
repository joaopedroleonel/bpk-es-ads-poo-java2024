//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("[1] Exercicio01");
        System.out.println("[2] Exercicio02");
        System.out.println("[3] Exercicio03");
        System.out.println("[4] Exercicio04");
        System.out.println("[5] Exercicio05");
        System.out.println("[6] Exercicio06");
        System.out.println("[7] Exercicio07");
        System.out.println("[8] Exercicio08");
        System.out.println("[9] Exercicio09");
        System.out.println("[10] Exercicio10");
        System.out.println("[11] Exercicio11");
        System.out.println("[12] Exercicio12");
        System.out.println("[13] Exercicio13");
        System.out.println("[14] Exercicio14");
        System.out.println("[15] Exercicio15");
        System.out.println("[16] Exercicio16");

        int digitado = scanner.nextInt();

        switch (digitado) {
            case 1:
                Exe01 exe01 = new Exe01();
                exe01.executar();
                break;
            case 2:
                Exe02 exe02 = new Exe02();
                exe02.executar();
                break;
            case 3:
                Exe03 exe03 = new Exe03();
                exe03.executar();
                break;
            case 4:
                Exe04 exe04 = new Exe04();
                exe04.executar();
                break;
            case 5:
                Exe05 exe05 = new Exe05();
                exe05.executar();
                break;
            case 6:
                Exe06 exe06 = new Exe06();
                exe06.executar();
                break;
            case 7:
                Exe07 exe07 = new Exe07();
                System.out.print("Resultado: " + exe07.executar() + "\n");
                break;
            case 8:
                Exe08 exe08 = new Exe08();
                exe08.executar();
                break;
            case 9:
                Exe09 exe09 = new Exe09();
                exe09.executar();
                break;
            case 10:
                Exe10 exe10 = new Exe10();
                exe10.executar();
                break;
            case 11:
                Exe11 exe11 = new Exe11();
                exe11.executar();
                break;
            case 12:
                Exe12 exe12 = new Exe12();
                exe12.executar();
                break;
            case 13:
                Exe13 exe13 = new Exe13();
                exe13.executar();
                break;
            case 14:
                Exe14 exe14 = new Exe14();
                exe14.executar();
                break;
            case 15:
                Exe15 exe15 = new Exe15();
                exe15.executar();
                break;
            case 16:
                Exe16 exe16 = new Exe16();
                exe16.executar();
                break;
        }

    }
}