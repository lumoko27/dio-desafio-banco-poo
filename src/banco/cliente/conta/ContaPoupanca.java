package banco.cliente.conta;

import banco.cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("---- Extrato Conta Poupança ----");
        super.imprimirInfos();
    }
}
