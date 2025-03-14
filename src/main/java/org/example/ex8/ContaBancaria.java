package org.example.ex8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean podeComprar(double valor) {
        return saldo >= valor;
    }

    public void comprar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor de compra não pode ser negativo.");
        }
        if (saldo < valor) {
            throw new IllegalArgumentException("O valor de compra não pode ser maior que o saldo.");
        }
        saldo -= valor;
    }
}