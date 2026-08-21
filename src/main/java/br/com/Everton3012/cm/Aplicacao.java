package main.java.br.com.Everton3012.cm;

import main.java.br.com.Everton3012.cm.modelo.Tabuleiro;
import main.java.br.com.Everton3012.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(5, 5, 5);

        new TabuleiroConsole(tabuleiro);

    }
}
