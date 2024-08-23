package exe22;

public class testEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("nome", "sla", 12);
        empresa.demitir();
        empresa.contratar();
    }

}
