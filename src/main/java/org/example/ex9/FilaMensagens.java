package org.example.ex9;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private Queue<String> mensagens = new LinkedList<>();

    public String obterProximaMensagem() {
        return mensagens.peek();
    }

    public void removerProximaMensagem() {
        mensagens.poll();
    }
}
