package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {

    void  fillBag(Bag bag) {
        IntStream.range(0, 12).forEach((i) -> bag.add(BALL.BLUE));
    }

    @Test
    void shouldAddABallToABag() {
        Bag bag = new Bag();
        assertTrue(bag.add(BALL.BLUE));
    }

    @Test
    void shouldReturnFalseIfBagCapacityExceeds() {
        Bag bag = new Bag();
        fillBag(bag);
        assertFalse(bag.add(BALL.BLUE));
    }

    @Test
    void shouldReturnFalseIfTryToAddMoreThanThreeGreenBalls() {
        Bag bag = new Bag();
        bag.add(BALL.GREEN);
        bag.add(BALL.GREEN);
        bag.add(BALL.GREEN);
        assertFalse(bag.add(BALL.GREEN));
    }

    @Test
    void redBallsCannotBeMoreThanDoubleThGreenBalls() {
        Bag bag = new Bag();
        bag.add(BALL.GREEN);
        bag.add(BALL.RED);
        bag.add(BALL.RED);
        assertFalse(bag.add(BALL.RED));
    }
}
