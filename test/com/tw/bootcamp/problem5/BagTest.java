package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

    void  fillBag(Bag bag) {
        IntStream.range(0, 12).forEach((i) -> bag.add(COLORS.BLUE));
    }

    @Test
    void shouldAddABallToABag() {
        Bag bag = new Bag();
        assertTrue(bag.add(COLORS.BLUE));
    }

    @Test
    void shouldReturnFalseIfBagCapacityExceeds() {
        Bag bag = new Bag();
        fillBag(bag);
        assertFalse(bag.add(COLORS.BLUE));
    }


}
