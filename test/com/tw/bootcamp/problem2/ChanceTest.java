package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {
    @Test
    void shouldRepresentChanceOfGettingTails() {
        Chance chance = Chance.of(0.3);
        assertEquals(Chance.of(0.3), chance);
    }

    @Test
    void shouldRepresentChanceOfNotGettingTails() {
        Chance chance = Chance.of(0.3);
        assertEquals(Chance.of(0.7), chance.ofNot());
    }

    @Test
    void shouldNotCreateChanceWithInvalidValue() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Chance.of(-1));
        assertEquals("Chance should be between 0 to 1",exception.getMessage());
    }

    @Test
    void shouldCreateChanceForTwoCoins() {
        Chance chance = Chance.of(0.75);
        assertEquals(Chance.of(0.75), chance);
    }
}
