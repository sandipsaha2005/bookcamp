package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCompareGallonWithLiters() {
        Volume gallon = Volume.ofGallon(1);
        Volume liter = Volume.ofLiter(3.78);
        assertEquals(liter, gallon);
    }
}