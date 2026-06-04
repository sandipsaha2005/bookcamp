package com.tw.bootcamp.problem5;

import java.util.HashMap;
import java.util.Map;

public class BagTemp {
    private final Rule1 rule1;
    private final Rule2 rule2;
    private int count;


    static class Rule1 {
        boolean evaluate(int ballCount) {
            return ballCount < 10;
        }
    }

    static class Rule2 {
        boolean evaluate(int ballCount) {
            return ballCount >= 0;
        }
    }

    public BagTemp(Rule1 rule1, Rule2 rule2) {
        this.rule1 = rule1;
        this.rule2 = rule2;
        this.count = 0;
    }

    public boolean add(BALL ball) {
        if (!rule1.evaluate(count) || !rule2.evaluate(count)) return false;
        count++;
        return true;
    }


    ProcessBuilder
}
