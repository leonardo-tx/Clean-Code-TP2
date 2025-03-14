package org.example.ex3;

public class ClienteNulo implements Cliente {
    @Override
    public String getNome() {
        return "Cliente não-existente";
    }
}
