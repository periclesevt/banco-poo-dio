package org.banco;

public interface Conta {
     void sacar(double valor);

     void depositar(double valor);

     void tranferir(Conta contaDestino, double valor);

     void imprimirExtrato();
}
