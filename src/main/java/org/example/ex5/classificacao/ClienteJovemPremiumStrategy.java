package org.example.ex5.classificacao;

import org.example.ex5.Cliente;

public class ClienteJovemPremiumStrategy implements ClienteStrategy {
    @Override
    public boolean atendeClassificacao(Cliente cliente) {
        return (
            cliente.getIdade() <= 60 &&
            cliente.getRenda() > 7000 &&
            cliente.getCompras() > 20
        );
    }

    @Override
    public String getClassificacao() {
        return "Cliente Premium Jovem";
    }
}
