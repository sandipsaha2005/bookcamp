package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private int count;
    private final int MAX_CAPACITY = 12;
    private final int GREEN_BALL_LIMIT = 3;
    private Map<BALL, Integer> storage;

    public Bag() {
        this.count = 0;
        storage = new HashMap<>();
    }

    public boolean add(BALL ball) {
        if (count >= MAX_CAPACITY) return false;
        int ballCount = getBallCount(ball);
        if (isGreenBallAddable(ball, ballCount)) return false;
        if (isRedBallAddable(ball, ballCount)) return false;
        if (ball == BALL.YELLOW && isYellowBallAddable()) return false;

        count++;
        storage.put(ball, ballCount + 1);
        return true;
    }

    private boolean isYellowBallAddable() {
        int yellowBallCount = getBallCount(BALL.YELLOW);
        return yellowBallCount >= count * 0.4;
    }

    private boolean isRedBallAddable(BALL ball, int ballCount) {
        int greenBallCount = getBallCount(BALL.GREEN);
        return ball == BALL.RED && greenBallCount * 2 >= ballCount;
    }

    private boolean isGreenBallAddable(BALL ball, int ballCount) {
        return ball == BALL.GREEN && ballCount >= GREEN_BALL_LIMIT;
    }

    private int getBallCount(BALL ball) {
        return storage.get(ball) == null ? 0 : storage.get(ball);
    }
}
