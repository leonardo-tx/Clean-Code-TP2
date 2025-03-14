package org.example.ex5;

import org.example.ex5.classificacao.*;

public class ClienteClassificador {
    private static final ClienteStrategy[] ESTRATEGIAS = {
        new ClienteJovemBaixaRendaStrategy(),
        new ClienteJovemRegularStrategy(),
        new ClienteJovemPremiumStrategy(),
        new ClienteSeniorBaixaRendaStrategy(),
        new ClienteSeniorRegularStrategy(),
        new ClienteSeniorPremiumStrategy(),
    };

    public String classificarCliente(Cliente cliente) {
        for (ClienteStrategy estrategia : ESTRATEGIAS) {
            if (estrategia.atendeClassificacao(cliente)) {
                return estrategia.getClassificacao();
            }
        }
        return "Cliente Sem Classificação";
    }
}