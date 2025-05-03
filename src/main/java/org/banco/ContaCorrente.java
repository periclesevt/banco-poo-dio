package org.banco;

public class ContaCorrente extends ContaImpl {
    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }

}
