package org.example.ex4;

public class Ajuste {
    public Produto aplicarDesconto(Produto produto) {
        Produto cloneProduto = produto.clone();
        cloneProduto.descontarPreco(10);

        return cloneProduto;
    }
}