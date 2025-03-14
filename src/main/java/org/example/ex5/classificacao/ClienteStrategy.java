package org.example.ex5.classificacao;

import org.example.ex5.Cliente;

public interface ClienteStrategy {
    boolean atendeClassificacao(Cliente cliente);
    String getClassificacao();
}
