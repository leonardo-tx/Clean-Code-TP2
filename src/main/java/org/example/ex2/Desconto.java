package org.example.ex2;

public class Desconto {
    private static final double MINIMO_PARA_DESCONTO = 1000.00;
    private static final double DESCONTO = 0.9;

    public double calcular(double preco) {
        if (preco >= MINIMO_PARA_DESCONTO) {
            return preco * DESCONTO;
        }
        return preco;
    }
}