package org.example.ex10;

public class Monitoramento {
    private int contadorAcessos = 0;

    public void incrementarAcessos() {
        contadorAcessos += 1;
    }

    public int getAcessos() {
        return contadorAcessos;
    }
}
