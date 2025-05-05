package org.banco;

public class ContaCorrente extends ContaImpl {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente ===");
        imprimirInfosComuns();

    }

}
