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
        int ballCount = getBallCount(ball);
        if (count >= MAX_CAPACITY || !isAddable(ball, ballCount)) return false;

        count++;
        storage.put(ball, ballCount + 1);
        return true;
    }

    private boolean isAddable(BALL ball, int ballCount) {
        return switch (ball) {
            case BALL.GREEN -> isGreenBallAddable(ball, ballCount);
            case BALL.RED -> isRedBallAddable(ball, ballCount);
            case BALL.YELLOW -> isYellowBallAddable();
            default -> true;
        };
    }

    private boolean isYellowBallAddable() {
        int yellowBallCount = getBallCount(BALL.YELLOW);
        return yellowBallCount < count * 0.4;
    }

    private boolean isRedBallAddable(BALL ball, int ballCount) {
        int greenBallCount = getBallCount(BALL.GREEN);
        return greenBallCount * 2 > ballCount;
    }

    private boolean isGreenBallAddable(BALL ball, int ballCount) {
        return  ballCount < GREEN_BALL_LIMIT;
    }

    private int getBallCount(BALL ball) {
        return storage.get(ball) == null ? 0 : storage.get(ball);
    }
}
