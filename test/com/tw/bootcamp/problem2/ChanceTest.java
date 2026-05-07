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
    void shouldRepresentChanceNotGettingTails() {
        Chance chance = Chance.of(0.3);
        assertEquals(Chance.of(0.7), chance.not());
    }

    @Test
    void shouldNotCreateChanceWithInvalidValue() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Chance.of(-1));
        assertEquals("Chance should be between 0 to 1",exception.getMessage());
    }

    @Test
    void shouldCreateChanceForGetting3OnADice() {
        Chance chance = Chance.of(0.1666666667);
        assertEquals(Chance.of(0.1666666667), chance);
    }

    @Test
    void shouldCreateChanceForTwoCoins() {
        Chance chance1 = Chance.of(0.50);
        Chance chance2 = Chance.of(0.50);

        Chance chance = chance1.and(chance2);
        assertEquals(Chance.of(0.25), chance);
    }

    @Test
    void shouldGetChangeOfGettingTailsInAtleastOneCoin() {
        Chance chance1 = Chance.of(0.50);
        Chance chance2 = Chance.of(0.50);

        Chance chance = chance1.or(chance2);
        assertEquals(Chance.of(0.75), chance);
    }
}
