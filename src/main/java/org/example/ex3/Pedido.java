package org.example.ex3;

public class Pedido {
    private final Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente == null ? new ClienteNulo() : cliente;
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }
}
