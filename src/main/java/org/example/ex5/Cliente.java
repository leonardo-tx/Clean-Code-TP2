package org.example.ex5;

public class Cliente {
    private int idade;
    private double renda;
    private int compras;
    private String localizacao;

    public Cliente(int idade, double renda, int compras, String localizacao) {
        this.idade = idade;
        this.renda = renda;
        this.compras = compras;
        this.localizacao = localizacao;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

    public int getCompras() {
        return compras;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
