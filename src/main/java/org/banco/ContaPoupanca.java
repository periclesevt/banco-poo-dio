package org.banco;

public class ContaPoupanca extends ContaImpl {

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();

    }
}
