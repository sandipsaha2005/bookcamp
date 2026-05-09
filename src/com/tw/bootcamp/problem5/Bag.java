package com.tw.bootcamp.problem5;

public class Bag {
    private int count;
    private int MAX_CAPACITY;

    public Bag() {
        this.count = 0;
        MAX_CAPACITY = 12;
    }

    public boolean add(COLORS color) {
        if(count >= MAX_CAPACITY) return false;
        count++;
        return true;
    }
}
