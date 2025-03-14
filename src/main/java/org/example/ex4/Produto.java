package org.example.ex4;

public class Produto implements Cloneable {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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
