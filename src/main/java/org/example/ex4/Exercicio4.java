package org.example.ex4;

public class Exercicio4 {
    public static void main(String[] args) {
        Ajuste ajuste = new Ajuste();
        Produto produto = new Produto("Teste", 20.00);

        Produto produtoComDesconto = ajuste.aplicarDesconto(produto);
        System.out.println("Produto original: R$ " + produto.preco);
        System.out.println("Produto com desconto: R$ " + produtoComDesconto.preco);
    }
}
