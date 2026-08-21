package main.java.br.com.Everton3012.cm.visao;

import java.util.Scanner;

import main.java.br.com.Everton3012.cm.excecao.ExitException;
import main.java.br.com.Everton3012.cm.excecao.ExplosaoException;
import main.java.br.com.Everton3012.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();
                System.out.println("Outra partida? (S/n)");

                String resposta = entrada.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();

                }
            }
        } catch (ExitException e) {
            System.out.println("Saindo do jogo...");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {

            while (tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x, y): ");

            }

            System.out.println("Você ganhou!");

        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você perdeu!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.println(texto);
        String digitado = entrada.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new ExitException();
        }

        return digitado;
    }
}
