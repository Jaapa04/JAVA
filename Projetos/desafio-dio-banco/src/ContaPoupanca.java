public class ContaPoupanca extends Conta {

    @Override
    public void imPrimirExtrato() {
        System.out.println("***  Extrato Conta Poupança  ***");
        super.imprimirInfosComuns();
    }
}
