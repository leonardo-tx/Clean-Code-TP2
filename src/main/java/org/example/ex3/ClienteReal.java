package org.example.ex3;

public class ClienteReal implements Cliente {
    private String nome;

    @Override
    public String getNome() {
        return nome;
    }
}
