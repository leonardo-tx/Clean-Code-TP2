package org.example.ex5.classificacao;

import org.example.ex5.Cliente;

public class ClienteJovemBaixaRendaStrategy implements ClienteStrategy {
    @Override
    public boolean atendeClassificacao(Cliente cliente) {
        return (
            cliente.getIdade() <= 60 &&
            cliente.getRenda() <= 7000
        );
    }

    @Override
    public String getClassificacao() {
        return "Cliente Jovem Baixa Renda";
    }
}
