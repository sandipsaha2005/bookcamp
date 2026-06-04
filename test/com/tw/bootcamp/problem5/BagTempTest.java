package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BagTempTest {
    @Test
    void shouldAddValidBall() {
        BagTemp.Rule1 rule1 =new  BagTemp.Rule1();
        BagTemp.Rule2 rule2 = new BagTemp.Rule2();
        BagTemp bagTemp = new BagTemp(rule1, rule2);
        bagTemp.add(BALL.YELLOW);
        assertTrue(bagTemp.add(BALL.YELLOW));
    }

    @Test
    void shouldNotAddMoreThan10() {
        BagTemp.Rule1 rule1 =new  BagTemp.Rule1();
        BagTemp.Rule2 rule2 = new BagTemp.Rule2();
        BagTemp bagTemp = new BagTemp(rule1, rule2);
        IntStream.range(0, 10).forEach(i -> bagTemp.add(BALL.GREEN));
        assertFalse(bagTemp.add(BALL.YELLOW));
    }
}