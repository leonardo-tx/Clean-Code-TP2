package org.example.ex12;

public class NotificacaoService {
    public void enviarNotificacao(TipoNotificacao tipo) {
        String mensagem = switch (tipo) {
            case EMAIL -> "Enviando e-mai...";
            case SMS -> "Enviando SMS...";
            case PUSH -> "Enviando notificação push...";
        };
        System.out.println(mensagem);
    }
}
