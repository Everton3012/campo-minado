package main.java.br.com.Everton3012.cm;

import main.java.br.com.Everton3012.cm.modelo.Tabuleiro;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(5, 5, 5);

        tabuleiro.abrir(3, 3);
        tabuleiro.alternarMarcacao(2, 2);
        tabuleiro.alternarMarcacao(3, 2);

        System.out.println(tabuleiro);
    }
}
