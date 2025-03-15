package org.example.ex4;

public class Produto implements Cloneable {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void descontarPreco(double valor) {
        double resultado = preco - valor;
        if (resultado < 0) {
            throw new IllegalArgumentException("O preço final não pode ser negativo.");
        }
        this.preco = resultado;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public Produto clone() {
        try {
            return (Produto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
