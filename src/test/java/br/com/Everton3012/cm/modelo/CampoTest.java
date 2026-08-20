package test.java.br.com.Everton3012.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.br.com.Everton3012.cm.modelo.Campo;

public class CampoTest {

    @Test
    void testAdicionarVizinhoValido() {
        Campo campo = new Campo(3, 3);
        Campo vizinho1 = new Campo(3, 2); // Vizinho na mesma linha
        Campo vizinho2 = new Campo(2, 3); // Vizinho na mesma coluna
        Campo vizinho3 = new Campo(2, 2); // Vizinho na diagonal

        assertTrue(campo.adicionarVizinho(vizinho1));
        assertTrue(campo.adicionarVizinho(vizinho2));
        assertTrue(campo.adicionarVizinho(vizinho3));
    }

    @Test
    void testAdicionarVizinhoInvalido() {
        Campo campo = new Campo(3, 3);
        Campo vizinho1 = new Campo(1, 1); // Muito longe
        Campo vizinho2 = new Campo(3, 5); // Muito longe na mesma linha

        assertFalse(campo.adicionarVizinho(vizinho1));
        assertFalse(campo.adicionarVizinho(vizinho2));
    }

    @Test
    void testNaoAdicionarVizinhoIgual() {
        Campo campo = new Campo(3, 3);

        // Não deve adicionar a si mesmo como vizinho
        assertFalse(campo.adicionarVizinho(campo));
    }

    @Test
    void testInicializacaoCampo() {
        Campo campo = new Campo(3, 3);

        assertEquals(3, campo.linha);
        assertEquals(3, campo.coluna);
        assertFalse(campo.minado);
        assertFalse(campo.aberto);
        assertFalse(campo.marcado);
    }
}
