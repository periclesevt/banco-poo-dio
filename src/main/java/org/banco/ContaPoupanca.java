package org.banco;

public class ContaPoupanca extends ContaImpl {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupanca ===");
        imprimirInfosComuns();

    }
}
