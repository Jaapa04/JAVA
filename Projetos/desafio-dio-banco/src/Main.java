public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        Conta cp = new ContaPoupanca();
        cc.tranferir(cp,50);

        cc.imPrimirExtrato();
        cp.imPrimirExtrato();

    }
}
