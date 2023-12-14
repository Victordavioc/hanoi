package src.main.java;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTest {

    @Test
    public void testCalcularNumeroMinimoDeJogadas() {
        // Corrigido o valor esperado para 7
        assertEquals(Hanoi.hanoi(3), 7);
    }

    @Test
    public void testCasoBase() {
        assertEquals(Hanoi.hanoi(1), 1);
    }

    @Test
    public void testNumeroNegativo() {
        // Corrigido para lançar uma exceção
        assertThrows(IllegalArgumentException.class, () -> Hanoi.hanoi(-1));
    }
}