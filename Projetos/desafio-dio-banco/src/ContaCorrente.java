public class ContaCorrente extends Conta {

    @Override
    public void imPrimirExtrato() {
        System.out.println("***  Extrato Conta Corrente  ***");
        super.imprimirInfosComuns();
    }
}
