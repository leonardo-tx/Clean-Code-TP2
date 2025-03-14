package org.example.ex5.classificacao;

import org.example.ex5.Cliente;

public class ClienteSeniorBaixaRendaStrategy implements ClienteStrategy {
    @Override
    public boolean atendeClassificacao(Cliente cliente) {
        return (
            cliente.getIdade() > 60 &&
            cliente.getRenda() <= 5000
        );
    }

    @Override
    public String getClassificacao() {
        return "Cliente Sênior Baixa Renda";
    }
}
