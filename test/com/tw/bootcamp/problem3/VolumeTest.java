package com.tw.bootcamp.problem3;

import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCompareGallonWithLiters() throws InvalidMeasureValue {
        Volume gallon = Volume.ofGallon(1);
        Volume liter = Volume.ofLiter(3.78);
        assertEquals(liter, gallon);
    }

    @Test
    void shouldThrowIfNegativeValueIsGivenAsVolume() {
        InvalidMeasureValue invalidMeasureValue = assertThrows(InvalidMeasureValue.class, () -> Volume.ofGallon(-1));
        assertEquals("Volume can't be negative", invalidMeasureValue.getMessage());
    }
}